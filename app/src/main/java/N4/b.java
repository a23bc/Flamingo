package N4;

import H2.C0196m;
import K4.x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5164d = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5165a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5167c;

    public b(C0196m c0196m, x xVar, Class cls) {
        this.f5166b = new o(c0196m, xVar, cls);
        this.f5167c = cls;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        Date dateB;
        switch (this.f5165a) {
            case 0:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.o()) {
                    arrayList.add(((x) ((o) this.f5166b).f5207c).a(aVar));
                }
                aVar.h();
                int size = arrayList.size();
                Class cls = (Class) this.f5167c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i7 = 0; i7 < size; i7++) {
                    Array.set(objNewInstance, i7, arrayList.get(i7));
                }
                return objNewInstance;
            case 1:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                Collection collection = (Collection) ((M4.o) this.f5167c).F();
                aVar.b();
                while (aVar.o()) {
                    collection.add(((x) ((o) this.f5166b).f5207c).a(aVar));
                }
                aVar.h();
                return collection;
            case 2:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC = aVar.C();
                synchronized (((ArrayList) this.f5166b)) {
                    try {
                        Iterator it = ((ArrayList) this.f5166b).iterator();
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
                return ((f) this.f5167c).a(dateB);
            default:
                Object objA = ((p) this.f5166b).f5211q.a(aVar);
                if (objA != null) {
                    Class cls2 = (Class) this.f5167c;
                    if (!cls2.isInstance(objA)) {
                        throw new K4.o("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + aVar.n(true));
                    }
                }
                return objA;
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        String str;
        switch (this.f5165a) {
            case 0:
                if (obj == null) {
                    bVar.o();
                    return;
                }
                bVar.c();
                int length = Array.getLength(obj);
                for (int i7 = 0; i7 < length; i7++) {
                    ((o) this.f5166b).b(bVar, Array.get(obj, i7));
                }
                bVar.h();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.o();
                    return;
                }
                bVar.c();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((o) this.f5166b).b(bVar, it.next());
                }
                bVar.h();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    bVar.o();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f5166b).get(0);
                synchronized (((ArrayList) this.f5166b)) {
                    str = dateFormat.format(date);
                    break;
                }
                bVar.w(str);
                return;
            default:
                ((p) this.f5166b).f5211q.b(bVar, obj);
                return;
        }
    }

    public String toString() {
        switch (this.f5165a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f5166b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public b(C0196m c0196m, Type type, x xVar, M4.o oVar) {
        this.f5166b = new o(c0196m, xVar, type);
        this.f5167c = oVar;
    }

    public b(f fVar, int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f5166b = arrayList;
        Objects.requireNonNull(fVar);
        this.f5167c = fVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i7, i8, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i7, i8));
        }
        if (M4.h.f4792a >= 9) {
            arrayList.add(M4.d.h(i7, i8));
        }
    }

    public b(p pVar, Class cls) {
        this.f5166b = pVar;
        this.f5167c = cls;
    }
}
