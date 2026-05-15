package T2;

import H.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f6930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f6931e;

    public static Serializable b1(int i7, m mVar) {
        if (i7 == 0) {
            return Double.valueOf(Double.longBitsToDouble(mVar.o()));
        }
        if (i7 == 1) {
            return Boolean.valueOf(mVar.u() == 1);
        }
        if (i7 == 2) {
            return d1(mVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return c1(mVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(mVar.o()));
                mVar.H(2);
                return date;
            }
            int iY = mVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i8 = 0; i8 < iY; i8++) {
                Serializable serializableB1 = b1(mVar.u(), mVar);
                if (serializableB1 != null) {
                    arrayList.add(serializableB1);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strD1 = d1(mVar);
            int iU = mVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableB12 = b1(iU, mVar);
            if (serializableB12 != null) {
                map.put(strD1, serializableB12);
            }
        }
    }

    public static HashMap c1(m mVar) {
        int iY = mVar.y();
        HashMap map = new HashMap(iY);
        for (int i7 = 0; i7 < iY; i7++) {
            String strD1 = d1(mVar);
            Serializable serializableB1 = b1(mVar.u(), mVar);
            if (serializableB1 != null) {
                map.put(strD1, serializableB1);
            }
        }
        return map;
    }

    public static String d1(m mVar) {
        int iA = mVar.A();
        int i7 = mVar.f18868b;
        mVar.H(iA);
        return new String(mVar.f18867a, i7, iA);
    }
}
