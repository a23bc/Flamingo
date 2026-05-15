package K4;

import A2.W;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f4068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f4069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ w[] f4070q;

    static {
        s sVar = new s();
        f4068o = sVar;
        t tVar = new t();
        f4069p = tVar;
        f4070q = new w[]{sVar, tVar, new w() { // from class: K4.u
            @Override // K4.w
            public final Number a(R4.a aVar) throws R4.c {
                String strC = aVar.C();
                try {
                    return Long.valueOf(Long.parseLong(strC));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strC);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f6676p) {
                                throw new R4.c("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.n(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e7) {
                        StringBuilder sbU = Z1.l.u("Cannot parse ", strC, "; at path ");
                        sbU.append(aVar.n(true));
                        throw new W(sbU.toString(), e7);
                    }
                }
            }
        }, new w() { // from class: K4.v
            @Override // K4.w
            public final Number a(R4.a aVar) {
                String strC = aVar.C();
                try {
                    return new BigDecimal(strC);
                } catch (NumberFormatException e7) {
                    StringBuilder sbU = Z1.l.u("Cannot parse ", strC, "; at path ");
                    sbU.append(aVar.n(true));
                    throw new W(sbU.toString(), e7);
                }
            }
        }};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f4070q.clone();
    }

    public abstract Number a(R4.a aVar);
}
