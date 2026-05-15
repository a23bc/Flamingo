package B2;

import E4.I;
import E4.S;
import E4.T;
import E4.b0;
import H2.InterfaceC0207y;
import H2.U;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import d2.C0821i;
import h3.q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.RandomAccess;
import k3.C1145a;
import t2.C1490t;
import t2.E;
import t2.F;
import t2.M;
import t2.N;
import t2.a0;
import t2.i0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements w2.g, w2.c, D2.p, D4.e {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f748o;

    public /* synthetic */ g(int i7) {
        this.f748o = i7;
    }

    public static Bitmap d(int i7, byte[] bArr) throws E2.d {
        try {
            return i6.h.v(i7, bArr);
        } catch (N e7) {
            throw new E2.d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i7 + ")", e7);
        } catch (IOException e8) {
            throw new E2.d(e8);
        }
    }

    @Override // D2.p
    public void a() {
    }

    @Override // D4.e
    public Object apply(Object obj) {
        switch (this.f748o) {
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return ((N2.m) obj).b().getClass().getSimpleName();
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                b0 b0Var = ((InterfaceC0207y) obj).h().f3188b;
                g gVar = new g(12);
                return I.p(b0Var instanceof RandomAccess ? new S(gVar, b0Var) : new T(gVar, b0Var));
            case 12:
                return Integer.valueOf(((i0) obj).f16492c);
            case 13:
                return Long.valueOf(((C1145a) obj).f14022b);
            case 14:
                return Long.valueOf(((C1145a) obj).f14023c);
            case 24:
                return (q) obj;
            case 25:
                long j3 = ((C1145a) obj).f14022b;
                if (j3 == -9223372036854775807L) {
                    j3 = 0;
                }
                return Long.valueOf(j3);
            case 26:
                Bundle bundle = (Bundle) obj;
                String string = bundle.getString(C1490t.f16733c);
                String string2 = bundle.getString(C1490t.f16734d);
                string2.getClass();
                return new C1490t(string, string2);
            case 27:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                Bundle bundle2 = new Bundle();
                int i7 = a0Var.f16395o;
                if (i7 != 0) {
                    bundle2.putInt(a0.f16392r, i7);
                }
                int i8 = a0Var.f16396p;
                if (i8 != 0) {
                    bundle2.putInt(a0.f16393s, i8);
                }
                int i9 = a0Var.f16397q;
                if (i9 != 0) {
                    bundle2.putInt(a0.f16394t, i9);
                }
                return bundle2;
            case 28:
                F f7 = (F) obj;
                f7.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(F.h, f7.f16211a);
                String str = f7.f16212b;
                if (str != null) {
                    bundle3.putString(F.f16206i, str);
                }
                String str2 = f7.f16213c;
                if (str2 != null) {
                    bundle3.putString(F.f16207j, str2);
                }
                int i10 = f7.f16214d;
                if (i10 != 0) {
                    bundle3.putInt(F.f16208k, i10);
                }
                int i11 = f7.f16215e;
                if (i11 != 0) {
                    bundle3.putInt(F.l, i11);
                }
                String str3 = f7.f16216f;
                if (str3 != null) {
                    bundle3.putString(F.f16209m, str3);
                }
                String str4 = f7.f16217g;
                if (str4 != null) {
                    bundle3.putString(F.f16210n, str4);
                }
                return bundle3;
            default:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(F.h);
                uri.getClass();
                String string3 = bundle4.getString(F.f16206i);
                String string4 = bundle4.getString(F.f16207j);
                int i12 = bundle4.getInt(F.f16208k, 0);
                int i13 = bundle4.getInt(F.l, 0);
                String string5 = bundle4.getString(F.f16209m);
                String string6 = bundle4.getString(F.f16210n);
                E e7 = new E();
                e7.f16202r = uri;
                e7.f16199o = M.j(string3);
                e7.f16203s = string4;
                e7.f16200p = i12;
                e7.f16201q = i13;
                e7.f16204t = string5;
                e7.f16205u = string6;
                return new F(e7);
        }
    }

    @Override // w2.g
    public void b(Object obj) {
        n nVar = (n) obj;
        switch (this.f748o) {
            case 0:
                nVar.getClass();
                break;
            default:
                nVar.getClass();
                break;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        switch (this.f748o) {
            case 2:
                ((D2.n) obj).a();
                break;
            default:
                ((U) obj).f3086b.a();
                break;
        }
    }

    public Constructor e() {
        switch (this.f748o) {
            case 15:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(N2.m.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(N2.m.class).getConstructor(new Class[0]);
        }
    }
}
