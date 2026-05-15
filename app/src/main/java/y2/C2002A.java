package y2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: y2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2002A extends AbstractC2005c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f20294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f20295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AssetFileDescriptor f20296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FileInputStream f20297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20299x;

    public C2002A(Context context) {
        super(false);
        this.f20294s = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    @Override // y2.h
    public final void close() {
        this.f20295t = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20297v;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20297v = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20296u;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new z(null, e7, 2000);
                    }
                } finally {
                    this.f20296u = null;
                    if (this.f20299x) {
                        this.f20299x = false;
                        p();
                    }
                }
            } catch (Throwable th) {
                this.f20297v = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f20296u;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f20296u = null;
                        if (this.f20299x) {
                            this.f20299x = false;
                            p();
                        }
                        throw th;
                    } finally {
                        this.f20296u = null;
                        if (this.f20299x) {
                            this.f20299x = false;
                            p();
                        }
                    }
                } catch (IOException e8) {
                    throw new z(null, e8, 2000);
                }
            }
        } catch (IOException e9) {
            throw new z(null, e9, 2000);
        }
    }

    @Override // y2.h
    public final long e(m mVar) throws z {
        Resources resourcesForApplication;
        int identifier;
        int i7;
        Resources resources;
        this.f20295t = mVar;
        q();
        Uri uriNormalizeScheme = mVar.f20345a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f20294s;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new z("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i7 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new z("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new z("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new z("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new z("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new z("Resource not found.", null, 2005);
                }
            }
            i7 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i7);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new z("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f20296u = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f20296u.getFileDescriptor());
            this.f20297v = fileInputStream;
            long j3 = mVar.f20349e;
            try {
                if (length != -1 && j3 > length) {
                    throw new z(null, null, 2008);
                }
                long startOffset = this.f20296u.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (jSkip != j3) {
                    throw new z(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f20298w = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f20298w = size;
                        if (size < 0) {
                            throw new z(null, null, 2008);
                        }
                    }
                } else {
                    long j7 = length - jSkip;
                    this.f20298w = j7;
                    if (j7 < 0) {
                        throw new k(2008);
                    }
                }
                long j8 = mVar.f20350f;
                if (j8 != -1) {
                    long j9 = this.f20298w;
                    this.f20298w = j9 == -1 ? j8 : Math.min(j9, j8);
                }
                this.f20299x = true;
                r(mVar);
                return j8 != -1 ? j8 : this.f20298w;
            } catch (z e8) {
                throw e8;
            } catch (IOException e9) {
                throw new z(null, e9, 2000);
            }
        } catch (Resources.NotFoundException e10) {
            throw new z(null, e10, 2005);
        }
    }

    @Override // y2.h
    public final Uri h() {
        m mVar = this.f20295t;
        if (mVar != null) {
            return mVar.f20345a;
        }
        return null;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws z {
        if (i8 == 0) {
            return 0;
        }
        long j3 = this.f20298w;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i8 = (int) Math.min(j3, i8);
                } catch (IOException e7) {
                    throw new z(null, e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f20297v;
            int i9 = w2.t.f18881a;
            int i10 = fileInputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j7 = this.f20298w;
                if (j7 != -1) {
                    this.f20298w = j7 - ((long) i10);
                }
                k(i10);
                return i10;
            }
            if (this.f20298w != -1) {
                throw new z("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
