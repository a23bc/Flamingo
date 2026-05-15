package p4;

import android.graphics.drawable.Drawable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f15020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f15022c;

    public d(Drawable drawable, h hVar, Throwable th) {
        this.f15020a = drawable;
        this.f15021b = hVar;
        this.f15022c = th;
    }

    @Override // p4.i
    public final Drawable a() {
        return this.f15020a;
    }

    @Override // p4.i
    public final h b() {
        return this.f15021b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC1209k.a(this.f15020a, dVar.f15020a)) {
            return AbstractC1209k.a(this.f15021b, dVar.f15021b) && AbstractC1209k.a(this.f15022c, dVar.f15022c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f15020a;
        return this.f15022c.hashCode() + ((this.f15021b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
