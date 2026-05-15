package x0;

import j5.AbstractC1109c;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1891a {

    /* JADX INFO: renamed from: a */
    public float f19863a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f19864b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f19865c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f19866d = 0.0f;

    public final void a(float f7, float f8, float f9, float f10) {
        this.f19863a = Math.max(f7, this.f19863a);
        this.f19864b = Math.max(f8, this.f19864b);
        this.f19865c = Math.min(f9, this.f19865c);
        this.f19866d = Math.min(f10, this.f19866d);
    }

    public final boolean b() {
        return (this.f19863a >= this.f19865c) | (this.f19864b >= this.f19866d);
    }

    public final String toString() {
        return "MutableRect(" + AbstractC1109c.B(this.f19863a) + ", " + AbstractC1109c.B(this.f19864b) + ", " + AbstractC1109c.B(this.f19865c) + ", " + AbstractC1109c.B(this.f19866d) + ')';
    }
}
