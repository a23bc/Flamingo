package Q4;

import K4.o;
import K4.x;
import Z1.l;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N4.a f6147c = new N4.a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N4.a f6148d = new N4.a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N4.a f6149e = new N4.a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6151b;

    public a(int i7) {
        this.f6150a = i7;
        switch (i7) {
            case 1:
                this.f6151b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f6151b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    private final Object c(R4.a aVar) {
        Time time;
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        try {
            synchronized (this) {
                time = new Time(((SimpleDateFormat) this.f6151b).parse(strC).getTime());
            }
            return time;
        } catch (ParseException e7) {
            StringBuilder sbU = l.u("Failed parsing '", strC, "' as SQL Time; at path ");
            sbU.append(aVar.n(true));
            throw new o(sbU.toString(), e7);
        }
    }

    private final void d(R4.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.o();
            return;
        }
        synchronized (this) {
            str = ((SimpleDateFormat) this.f6151b).format((Date) time);
        }
        bVar.w(str);
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        Date date;
        switch (this.f6150a) {
            case 0:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC = aVar.C();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f6151b).parse(strC);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e7) {
                    StringBuilder sbU = l.u("Failed parsing '", strC, "' as SQL Date; at path ");
                    sbU.append(aVar.n(true));
                    throw new o(sbU.toString(), e7);
                }
            case 1:
                return c(aVar);
            default:
                Date date2 = (Date) ((x) this.f6151b).a(aVar);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        String str;
        switch (this.f6150a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    bVar.o();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f6151b).format((Date) date);
                    break;
                }
                bVar.w(str);
                return;
            case 1:
                d(bVar, obj);
                return;
            default:
                ((x) this.f6151b).b(bVar, (Timestamp) obj);
                return;
        }
    }

    public a(x xVar) {
        this.f6150a = 2;
        this.f6151b = xVar;
    }
}
