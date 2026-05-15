package N4;

import K4.w;
import K4.x;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5170c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f5171d = new h(0, new d(w.f4069p));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5172a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f5173b;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f5173b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (M4.h.f4792a >= 9) {
            arrayList.add(M4.d.h(2, 2));
        }
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        Date dateB;
        switch (this.f5172a) {
            case 0:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC = aVar.C();
                synchronized (((ArrayList) this.f5173b)) {
                    try {
                        Iterator it = ((ArrayList) this.f5173b).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                try {
                                    dateB = O4.a.b(strC, new ParsePosition(0));
                                } catch (ParseException e7) {
                                    StringBuilder sbU = Z1.l.u("Failed parsing '", strC, "' as Date; at path ");
                                    sbU.append(aVar.n(true));
                                    throw new K4.o(sbU.toString(), e7);
                                }
                                break;
                            } else {
                                try {
                                    dateB = ((DateFormat) it.next()).parse(strC);
                                } catch (ParseException unused) {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return dateB;
            default:
                int iE = aVar.E();
                int iB = AbstractC1676i.b(iE);
                if (iB == 5 || iB == 6) {
                    return ((w) this.f5173b).a(aVar);
                }
                if (iB == 8) {
                    aVar.A();
                    return null;
                }
                throw new K4.o("Expecting number, got: " + A0.e.O(iE) + "; at path " + aVar.n(false));
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        String str;
        switch (this.f5172a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    bVar.o();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f5173b).get(0);
                synchronized (((ArrayList) this.f5173b)) {
                    str = dateFormat.format(date);
                    break;
                }
                bVar.w(str);
                return;
            default:
                bVar.u((Number) obj);
                return;
        }
    }

    public d(w wVar) {
        this.f5173b = wVar;
    }
}
