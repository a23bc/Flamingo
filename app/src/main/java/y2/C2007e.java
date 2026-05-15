package y2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: y2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2007e extends AbstractC2005c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ContentResolver f20321s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Uri f20322t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AssetFileDescriptor f20323u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FileInputStream f20324v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20326x;

    public C2007e(Context context) {
        super(false);
        this.f20321s = context.getContentResolver();
    }

    @Override // y2.h
    public final void close() {
        this.f20322t = null;
        try {
            try {
                FileInputStream fileInputStream = this.f20324v;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f20324v = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f20323u;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new C2006d(e7, 2000);
                    }
                } finally {
                    this.f20323u = null;
                    if (this.f20326x) {
                        this.f20326x = false;
                        p();
                    }
                }
            } catch (Throwable th) {
                this.f20324v = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f20323u;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f20323u = null;
                        if (this.f20326x) {
                            this.f20326x = false;
                            p();
                        }
                        throw th;
                    } finally {
                        this.f20323u = null;
                        if (this.f20326x) {
                            this.f20326x = false;
                            p();
                        }
                    }
                } catch (IOException e8) {
                    throw new C2006d(e8, 2000);
                }
            }
        } catch (IOException e9) {
            throw new C2006d(e9, 2000);
        }
    }

    @Override // y2.h
    public final long e(m mVar) throws C2006d {
        int i7;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = mVar.f20345a.normalizeScheme();
                this.f20322t = uriNormalizeScheme;
                q();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f20321s;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f20323u = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i7 = 2000;
                    try {
                        throw new C2006d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e7) {
                        e = e7;
                        if (e instanceof FileNotFoundException) {
                            i7 = 2005;
                        }
                        throw new C2006d(e, i7);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f20324v = fileInputStream;
                long j3 = mVar.f20349e;
                if (length != -1 && j3 > length) {
                    throw new C2006d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (jSkip != j3) {
                    throw new C2006d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f20325w = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f20325w = jPosition;
                        if (jPosition < 0) {
                            throw new C2006d(null, 2008);
                        }
                    }
                } else {
                    long j7 = length - jSkip;
                    this.f20325w = j7;
                    if (j7 < 0) {
                        throw new C2006d(null, 2008);
                    }
                }
                long j8 = mVar.f20350f;
                if (j8 != -1) {
                    long j9 = this.f20325w;
                    this.f20325w = j9 == -1 ? j8 : Math.min(j9, j8);
                }
                this.f20326x = true;
                r(mVar);
                return j8 != -1 ? j8 : this.f20325w;
            } catch (C2006d e8) {
                throw e8;
            }
        } catch (IOException e9) {
            e = e9;
            i7 = 2000;
        }
    }

    @Override // y2.h
    public final Uri h() {
        return this.f20322t;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws C2006d {
        if (i8 == 0) {
            return 0;
        }
        long j3 = this.f20325w;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i8 = (int) Math.min(j3, i8);
                } catch (IOException e7) {
                    throw new C2006d(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f20324v;
            int i9 = w2.t.f18881a;
            int i10 = fileInputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j7 = this.f20325w;
                if (j7 != -1) {
                    this.f20325w = j7 - ((long) i10);
                }
                k(i10);
                return i10;
            }
        }
        return -1;
    }
}
