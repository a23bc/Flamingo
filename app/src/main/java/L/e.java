package L;

import k.AbstractC1113a;
import m5.AbstractC1209k;
import n1.n;
import x0.C1893c;
import x0.C1894d;
import y0.AbstractC1959I;
import y0.C1955E;
import y0.C1956F;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    @Override // L.a
    public final AbstractC1959I b(long j3, float f7, float f8, float f9, float f10, n nVar) {
        if (f7 + f8 + f9 + f10 == 0.0f) {
            return new C1955E(AbstractC1113a.o(0L, j3));
        }
        C1893c c1893cO = AbstractC1113a.o(0L, j3);
        n nVar2 = n.f14521o;
        float f11 = nVar == nVar2 ? f7 : f8;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
        float f12 = nVar == nVar2 ? f8 : f7;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
        float f13 = nVar == nVar2 ? f9 : f10;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        float f14 = nVar == nVar2 ? f10 : f9;
        return new C1956F(new C1894d(c1893cO.f19869a, c1893cO.f19870b, c1893cO.f19871c, c1893cO.f19872d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC1209k.a(this.f4080a, eVar.f4080a)) {
            return false;
        }
        if (!AbstractC1209k.a(this.f4081b, eVar.f4081b)) {
            return false;
        }
        if (AbstractC1209k.a(this.f4082c, eVar.f4082c)) {
            return AbstractC1209k.a(this.f4083d, eVar.f4083d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4083d.hashCode() + ((this.f4082c.hashCode() + ((this.f4081b.hashCode() + (this.f4080a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4080a + ", topEnd = " + this.f4081b + ", bottomEnd = " + this.f4082c + ", bottomStart = " + this.f4083d + ')';
    }
}
