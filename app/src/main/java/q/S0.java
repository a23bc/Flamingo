package q;

import A2.RunnableC0022x;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import j5.AbstractC1109c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m5.AbstractC1209k;
import org.xmlpull.v1.XmlPullParserException;
import s3.C1433c;
import t.C1465u;
import t2.C1486o;
import t2.C1487p;
import t3.C1500D;
import v2.C1635b;
import w2.AbstractC1697a;
import w3.C1716c0;
import w3.C1751t0;
import x3.C1924i;
import y1.AbstractC1996e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements k3.d, t3.y {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f15224o;

    /* JADX INFO: renamed from: p */
    public Object f15225p;

    /* JADX INFO: renamed from: q */
    public Object f15226q;

    /* JADX INFO: renamed from: r */
    public Object f15227r;

    public /* synthetic */ S0() {
        this.f15224o = 2;
    }

    public static S0 k(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new S0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    @Override // k3.d
    public int D() {
        return ((long[]) this.f15227r).length;
    }

    public RemoteViews a(int i7) {
        boolean z6;
        int i8;
        Object obj;
        ApplicationInfo applicationInfo;
        Resources resourcesForApplication;
        ((u1.i) this.f15225p).f17159a.getResources();
        RemoteViews remoteViews = new RemoteViews(((u1.i) this.f15225p).f17159a.getPackageName(), i7);
        ((u1.i) this.f15225p).getClass();
        if (((u1.i) this.f15225p).h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            IconCompat iconCompat = ((u1.i) this.f15225p).h;
            Context context = ((u1.i) this.f15225p).f17159a;
            if (iconCompat.f9347a == 2 && (obj = iconCompat.f9348b) != null) {
                String str = (String) obj;
                if (str.contains(":")) {
                    String str2 = str.split(":", -1)[1];
                    String str3 = str2.split("/", -1)[0];
                    String str4 = str2.split("/", -1)[1];
                    String str5 = str.split(":", -1)[0];
                    if (!"0_resource_name_obfuscated".equals(str4)) {
                        String strD = iconCompat.d();
                        if ("android".equals(strD)) {
                            resourcesForApplication = Resources.getSystem();
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            try {
                                applicationInfo = packageManager.getApplicationInfo(strD, 8192);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        }
                        int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                        if (iconCompat.f9351e != identifier) {
                            iconCompat.f9351e = identifier;
                        }
                    }
                }
            }
            Drawable drawableLoadDrawable = iconCompat.f(context).loadDrawable(context);
            int intrinsicWidth = drawableLoadDrawable.getIntrinsicWidth();
            int intrinsicHeight = drawableLoadDrawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
            remoteViews.setImageViewBitmap(R.id.icon, bitmapCreateBitmap);
        }
        CharSequence charSequence = ((u1.i) this.f15225p).f17163e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = ((u1.i) this.f15225p).f17164f;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z6 = true;
        } else {
            z6 = false;
        }
        ((u1.i) this.f15225p).getClass();
        ((u1.i) this.f15225p).getClass();
        remoteViews.setViewVisibility(R.id.info, 8);
        ((u1.i) this.f15225p).getClass();
        u1.i iVar = (u1.i) this.f15225p;
        if ((iVar.f17166i ? iVar.f17174r.when : 0L) != 0) {
            if (iVar.f17167j) {
                remoteViews.setViewVisibility(R.id.chronometer, 0);
                u1.i iVar2 = (u1.i) this.f15225p;
                remoteViews.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + (iVar2.f17166i ? iVar2.f17174r.when : 0L));
                remoteViews.setBoolean(R.id.chronometer, "setStarted", true);
                ((u1.i) this.f15225p).getClass();
            } else {
                remoteViews.setViewVisibility(R.id.time, 0);
                u1.i iVar3 = (u1.i) this.f15225p;
                remoteViews.setLong(R.id.time, "setTime", iVar3.f17166i ? iVar3.f17174r.when : 0L);
            }
            i8 = 0;
        } else {
            i8 = 8;
        }
        remoteViews.setViewVisibility(R.id.right_side, i8);
        remoteViews.setViewVisibility(R.id.line3, z6 ? 0 : 8);
        return remoteViews;
    }

    @Override // t3.y
    public void b(w2.m mVar) {
        long jD;
        AbstractC1697a.j((w2.r) this.f15226q);
        int i7 = w2.t.f18881a;
        w2.r rVar = (w2.r) this.f15226q;
        synchronized (rVar) {
            try {
                long j3 = rVar.f18879c;
                jD = j3 != -9223372036854775807L ? j3 + rVar.f18878b : rVar.d();
            } finally {
            }
        }
        long jE = ((w2.r) this.f15226q).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C1487p c1487p = (C1487p) this.f15225p;
        if (jE != c1487p.f16706r) {
            C1486o c1486oA = c1487p.a();
            c1486oA.f16631q = jE;
            C1487p c1487p2 = new C1487p(c1486oA);
            this.f15225p = c1487p2;
            ((N2.H) this.f15227r).e(c1487p2);
        }
        int iA = mVar.a();
        ((N2.H) this.f15227r).c(iA, mVar);
        ((N2.H) this.f15227r).f(jD, 1, iA, 0, null);
    }

    @Override // t3.y
    public void c(w2.r rVar, N2.o oVar, C1500D c1500d) {
        this.f15226q = rVar;
        c1500d.a();
        c1500d.b();
        N2.H hE = oVar.E(c1500d.f16800d, 5);
        this.f15227r = hE;
        hE.e((C1487p) this.f15225p);
    }

    @Override // k3.d
    public int d(long j3) {
        long[] jArr = (long[]) this.f15227r;
        int iB = w2.t.b(jArr, j3, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public RemoteViews e(u1.h hVar) {
        boolean z6 = hVar.f17158g == null;
        RemoteViews remoteViews = new RemoteViews(((u1.i) this.f15225p).f17159a.getPackageName(), R.layout.media3_notification_media_action);
        IconCompat iconCompatA = hVar.a();
        if (iconCompatA != null) {
            remoteViews.setImageViewResource(R.id.action0, iconCompatA.c());
        }
        if (!z6) {
            remoteViews.setOnClickPendingIntent(R.id.action0, hVar.f17158g);
        }
        remoteViews.setContentDescription(R.id.action0, hVar.f17157f);
        return remoteViews;
    }

    public ColorStateList f(int i7) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) this.f15226q;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListR = AbstractC1109c.r((Context) this.f15225p, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListR;
    }

    public Drawable g(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f15226q;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : i6.g.v((Context) this.f15225p, resourceId);
    }

    public Drawable h(int i7) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f15226q).hasValue(i7) || (resourceId = ((TypedArray) this.f15226q).getResourceId(i7, 0)) == 0) {
            return null;
        }
        C1336s c1336sA = C1336s.a();
        Context context = (Context) this.f15225p;
        synchronized (c1336sA) {
            drawableG = c1336sA.f15390a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface i(int i7, int i8, d1.e eVar) {
        int resourceId = ((TypedArray) this.f15226q).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f15227r) == null) {
                this.f15227r = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f15227r;
            ThreadLocal threadLocal = x1.k.f19912a;
            Context context = (Context) this.f15225p;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    eVar.b(-3);
                    return null;
                }
                int i9 = typedValue.assetCookie;
                C1465u c1465u = AbstractC1996e.f20279b;
                Typeface typeface = (Typeface) c1465u.c(AbstractC1996e.b(resources, resourceId, string, i9, i8));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0022x(eVar, 23, typeface));
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        x1.d dVarH = x1.b.h(resources.getXml(resourceId), resources);
                        if (dVarH != null) {
                            return AbstractC1996e.a(context, dVarH, resources, resourceId, string, typedValue.assetCookie, i8, eVar, true);
                        }
                        eVar.b(-3);
                        return null;
                    }
                    int i10 = typedValue.assetCookie;
                    Typeface typefaceD = AbstractC1996e.f20278a.D(context, resources, resourceId, string, i8);
                    if (typefaceD != null) {
                        c1465u.d(AbstractC1996e.b(resources, resourceId, string, i10, i8), typefaceD);
                    }
                    if (typefaceD != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0022x(eVar, 23, typefaceD));
                    } else {
                        eVar.b(-3);
                    }
                    return typefaceD;
                } catch (IOException | XmlPullParserException unused) {
                    eVar.b(-3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // k3.d
    public long j(int i7) {
        AbstractC1697a.d(i7 >= 0);
        long[] jArr = (long[]) this.f15227r;
        AbstractC1697a.d(i7 < jArr.length);
        return jArr[i7];
    }

    public void l() {
        ((TypedArray) this.f15226q).recycle();
    }

    @Override // k3.d
    public List s(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = (List) this.f15225p;
            if (i7 >= list.size()) {
                break;
            }
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f15226q;
            if (jArr[i8] <= j3 && j3 < jArr[i8 + 1]) {
                C1433c c1433c = (C1433c) list.get(i7);
                C1635b c1635b = c1433c.f15886a;
                if (c1635b.f18260e == -3.4028235E38f) {
                    arrayList2.add(c1433c);
                } else {
                    arrayList.add(c1635b);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, new C1.b(20));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            C1635b c1635b2 = ((C1433c) arrayList2.get(i9)).f15886a;
            arrayList.add(new C1635b(c1635b2.f18256a, c1635b2.f18257b, c1635b2.f18258c, c1635b2.f18259d, (-1) - i9, 1, c1635b2.f18262g, c1635b2.h, c1635b2.f18263i, c1635b2.f18267n, c1635b2.f18268o, c1635b2.f18264j, c1635b2.f18265k, c1635b2.l, c1635b2.f18266m, c1635b2.f18269p, c1635b2.f18270q));
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f15224o) {
            case 7:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f15225p;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f15226q;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f15227r;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                AbstractC1209k.e(string, "sb.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public S0(ArrayList arrayList) {
        this.f15224o = 1;
        this.f15225p = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f15226q = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C1433c c1433c = (C1433c) arrayList.get(i7);
            int i8 = i7 * 2;
            long[] jArr = (long[]) this.f15226q;
            jArr[i8] = c1433c.f15887b;
            jArr[i8 + 1] = c1433c.f15888c;
        }
        long[] jArr2 = (long[]) this.f15226q;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f15227r = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public S0(String str) {
        this.f15224o = 3;
        C1486o c1486o = new C1486o();
        c1486o.l = t2.M.j(str);
        this.f15225p = new C1487p(c1486o);
    }

    public S0(Uri uri, String str, String str2) {
        this.f15224o = 7;
        this.f15225p = uri;
        this.f15226q = str;
        this.f15227r = str2;
    }

    public S0(Context context, TypedArray typedArray) {
        this.f15224o = 0;
        this.f15225p = context;
        this.f15226q = typedArray;
    }

    public S0(byte[] bArr, I4.y yVar) {
        this.f15224o = 4;
        this.f15225p = bArr;
        this.f15226q = null;
        this.f15227r = yVar;
    }

    public S0(Uri uri, I4.y yVar) {
        this.f15224o = 4;
        this.f15225p = null;
        this.f15226q = uri;
        this.f15227r = yVar;
    }

    public S0(C1716c0 c1716c0) {
        this.f15224o = 5;
        this.f15227r = c1716c0;
        this.f15225p = new C1924i(this);
    }

    public S0(C1751t0 c1751t0) {
        this.f15224o = 6;
        this.f15226q = c1751t0;
    }
}
