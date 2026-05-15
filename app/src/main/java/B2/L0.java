package b2;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a */
    public final Context f10084a;

    /* JADX INFO: renamed from: b */
    public final int f10085b;

    /* JADX INFO: renamed from: c */
    public final boolean f10086c;

    /* JADX INFO: renamed from: d */
    public final C0670l0 f10087d;

    /* JADX INFO: renamed from: e */
    public final int f10088e;

    /* JADX INFO: renamed from: f */
    public final boolean f10089f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f10090g;
    public final C0664i0 h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f10091i;

    /* JADX INFO: renamed from: j */
    public final long f10092j;

    /* JADX INFO: renamed from: k */
    public final int f10093k;
    public final boolean l;

    /* JADX INFO: renamed from: m */
    public final Integer f10094m;

    /* JADX INFO: renamed from: n */
    public final ComponentName f10095n;

    public L0(Context context, int i7, boolean z6, C0670l0 c0670l0, int i8, boolean z7, AtomicInteger atomicInteger, C0664i0 c0664i0, AtomicBoolean atomicBoolean, long j3, int i9, boolean z8, Integer num, ComponentName componentName) {
        this.f10084a = context;
        this.f10085b = i7;
        this.f10086c = z6;
        this.f10087d = c0670l0;
        this.f10088e = i8;
        this.f10089f = z7;
        this.f10090g = atomicInteger;
        this.h = c0664i0;
        this.f10091i = atomicBoolean;
        this.f10092j = j3;
        this.f10093k = i9;
        this.l = z8;
        this.f10094m = num;
        this.f10095n = componentName;
    }

    public static L0 a(L0 l02, int i7, AtomicInteger atomicInteger, C0664i0 c0664i0, AtomicBoolean atomicBoolean, long j3, Integer num, int i8) {
        Context context = l02.f10084a;
        int i9 = l02.f10085b;
        boolean z6 = l02.f10086c;
        C0670l0 c0670l0 = l02.f10087d;
        int i10 = (i8 & 16) != 0 ? l02.f10088e : i7;
        boolean z7 = (i8 & 32) != 0 ? l02.f10089f : true;
        AtomicInteger atomicInteger2 = (i8 & 64) != 0 ? l02.f10090g : atomicInteger;
        C0664i0 c0664i02 = (i8 & 128) != 0 ? l02.h : c0664i0;
        AtomicBoolean atomicBoolean2 = (i8 & 256) != 0 ? l02.f10091i : atomicBoolean;
        long j7 = (i8 & 512) != 0 ? l02.f10092j : j3;
        int i11 = (i8 & 1024) != 0 ? l02.f10093k : 0;
        l02.getClass();
        boolean z8 = (i8 & 4096) != 0 ? l02.l : true;
        Integer num2 = (i8 & 8192) != 0 ? l02.f10094m : num;
        ComponentName componentName = l02.f10095n;
        l02.getClass();
        return new L0(context, i9, z6, c0670l0, i10, z7, atomicInteger2, c0664i02, atomicBoolean2, j7, i11, z8, num2, componentName);
    }

    public final L0 b(C0664i0 c0664i0, int i7) {
        return a(this, i7, null, c0664i0, null, 0L, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L0) {
            L0 l02 = (L0) obj;
            if (this.f10084a.equals(l02.f10084a) && this.f10085b == l02.f10085b && this.f10086c == l02.f10086c && this.f10087d.equals(l02.f10087d) && this.f10088e == l02.f10088e && this.f10089f == l02.f10089f && AbstractC1209k.a(this.f10090g, l02.f10090g) && AbstractC1209k.a(this.h, l02.h) && AbstractC1209k.a(this.f10091i, l02.f10091i) && this.f10092j == l02.f10092j && this.f10093k == l02.f10093k && this.l == l02.l && AbstractC1209k.a(this.f10094m, l02.f10094m) && AbstractC1209k.a(this.f10095n, l02.f10095n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f10091i.hashCode() + ((this.h.hashCode() + ((this.f10090g.hashCode() + ((((((this.f10087d.hashCode() + (((((this.f10084a.hashCode() * 31) + this.f10085b) * 31) + (this.f10086c ? 1231 : 1237)) * 31)) * 31) + this.f10088e) * 31) + (this.f10089f ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        long j3 = this.f10092j;
        int i7 = (((((((((int) (j3 ^ (j3 >>> 32))) + iHashCode) * 31) + this.f10093k) * 31) - 1) * 31) + (this.l ? 1231 : 1237)) * 31;
        Integer num = this.f10094m;
        int iHashCode2 = (i7 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f10095n;
        return iHashCode2 + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f10084a + ", appWidgetId=" + this.f10085b + ", isRtl=" + this.f10086c + ", layoutConfiguration=" + this.f10087d + ", itemPosition=" + this.f10088e + ", isLazyCollectionDescendant=" + this.f10089f + ", lastViewId=" + this.f10090g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.f10091i + ", layoutSize=" + ((Object) n1.i.c(this.f10092j)) + ", layoutCollectionViewId=" + this.f10093k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.f10094m + ", actionBroadcastReceiver=" + this.f10095n + ')';
    }
}
