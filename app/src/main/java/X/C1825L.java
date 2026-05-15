package x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import z.EnumC2048l0;

/* JADX INFO: renamed from: x.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1825L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19659c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EdgeEffect f19660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f19661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f19662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f19663g;
    public EdgeEffect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeEffect f19664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeEffect f19665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeEffect f19666k;

    public C1825L(Context context, int i7) {
        this.f19657a = context;
        this.f19658b = i7;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1881v.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(EnumC2048l0 enumC2048l0) {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f19657a;
        EdgeEffect edgeEffectA = i7 >= 31 ? AbstractC1881v.a(context) : new C1831S(context);
        edgeEffectA.setColor(this.f19658b);
        if (!n1.m.b(this.f19659c, 0L)) {
            if (enumC2048l0 == EnumC2048l0.f20894o) {
                long j3 = this.f19659c;
                edgeEffectA.setSize((int) (j3 >> 32), (int) (4294967295L & j3));
                return edgeEffectA;
            }
            long j7 = this.f19659c;
            edgeEffectA.setSize((int) (4294967295L & j7), (int) (j7 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f19661e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC2048l0.f20894o);
        this.f19661e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f19662f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC2048l0.f20895p);
        this.f19662f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f19663g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC2048l0.f20895p);
        this.f19663g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f19660d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(EnumC2048l0.f20894o);
        this.f19660d = edgeEffectA;
        return edgeEffectA;
    }
}
