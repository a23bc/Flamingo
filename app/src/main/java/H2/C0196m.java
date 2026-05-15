package H2;

import A2.C0001b;
import A2.C0014o;
import N2.C0294k;
import android.content.Context;
import com.google.gson.reflect.TypeToken;
import d.C0746L;
import f0.C0886f0;
import f0.C0888g0;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: H2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0196m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3203a;

    /* JADX INFO: renamed from: b */
    public boolean f3204b;

    /* JADX INFO: renamed from: c */
    public final Object f3205c;

    /* JADX INFO: renamed from: d */
    public final Object f3206d;

    /* JADX INFO: renamed from: e */
    public Object f3207e;

    /* JADX INFO: renamed from: f */
    public Object f3208f;

    /* JADX INFO: renamed from: g */
    public Object f3209g;

    public C0196m(int i7, float f7, I.K k7) {
        this.f3203a = 1;
        this.f3205c = k7;
        this.f3206d = new C0888g0(i7);
        this.f3207e = new C0886f0(f7);
        this.f3209g = new H.S(i7, 30, 100);
    }

    public static void a(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public Object b(Class cls, String str) {
        Object objC = c(str, TypeToken.get(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objC);
    }

    public Object c(String str, TypeToken typeToken) {
        Object objA = null;
        if (str == null) {
            return null;
        }
        R4.a aVar = new R4.a(new StringReader(str));
        boolean z6 = true;
        aVar.f6676p = true;
        try {
            try {
                try {
                    try {
                        try {
                            aVar.E();
                            try {
                                objA = d(typeToken).a(aVar);
                            } catch (EOFException e7) {
                                e = e7;
                                z6 = false;
                                if (!z6) {
                                    throw new K4.o(e);
                                }
                            }
                        } catch (AssertionError e8) {
                            throw new AssertionError("AssertionError (GSON 2.10.1): " + e8.getMessage(), e8);
                        }
                    } catch (IllegalStateException e9) {
                        throw new K4.o(e9);
                    }
                } catch (IOException e10) {
                    throw new K4.o(e10);
                }
            } catch (EOFException e11) {
                e = e11;
            }
            if (objA != null) {
                try {
                    if (aVar.E() != 10) {
                        throw new K4.o("JSON document was not fully consumed.");
                    }
                } catch (R4.c e12) {
                    throw new K4.o(e12);
                } catch (IOException e13) {
                    throw new K4.o(e13);
                }
            }
            return objA;
        } finally {
            aVar.f6676p = false;
        }
    }

    public K4.x d(TypeToken typeToken) {
        boolean z6;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3206d;
        K4.x xVar = (K4.x) concurrentHashMap.get(typeToken);
        if (xVar != null) {
            return xVar;
        }
        ThreadLocal threadLocal = (ThreadLocal) this.f3205c;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z6 = true;
        } else {
            K4.x xVar2 = (K4.x) map.get(typeToken);
            if (xVar2 != null) {
                return xVar2;
            }
            z6 = false;
        }
        try {
            K4.k kVar = new K4.k();
            K4.x xVarA = null;
            kVar.f4052a = null;
            map.put(typeToken, kVar);
            Iterator it = ((List) this.f3209g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xVarA = ((K4.y) it.next()).a(this, typeToken);
                if (xVarA != null) {
                    if (kVar.f4052a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    kVar.f4052a = xVarA;
                    map.put(typeToken, xVarA);
                }
            }
            if (z6) {
                threadLocal.remove();
            }
            if (xVarA != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return xVarA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z6) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public K4.x e(K4.y yVar, TypeToken typeToken) {
        List<K4.y> list = (List) this.f3209g;
        if (!list.contains(yVar)) {
            yVar = (N4.c) this.f3208f;
        }
        boolean z6 = false;
        for (K4.y yVar2 : list) {
            if (z6) {
                K4.x xVarA = yVar2.a(this, typeToken);
                if (xVarA != null) {
                    return xVarA;
                }
            } else if (yVar2 == yVar) {
                z6 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public D4.j f(int i7) {
        D4.j c0014o;
        final int i8 = 3;
        final int i9 = 1;
        final int i10 = 2;
        HashMap map = (HashMap) this.f3206d;
        D4.j jVar = (D4.j) map.get(Integer.valueOf(i7));
        if (jVar != null) {
            return jVar;
        }
        final V1.a aVar = (V1.a) this.f3208f;
        aVar.getClass();
        if (i7 == 0) {
            final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC0208z.class);
            final int i11 = 0;
            c0014o = new D4.j() { // from class: H2.l
                @Override // D4.j
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return C0198o.d((Class) genericDeclarationAsSubclass, aVar);
                        case 1:
                            return C0198o.d((Class) genericDeclarationAsSubclass, aVar);
                        case 2:
                            return C0198o.d((Class) genericDeclarationAsSubclass, aVar);
                        default:
                            return new P(aVar, (C0294k) ((C0196m) genericDeclarationAsSubclass).f3205c);
                    }
                }
            };
        } else if (i7 == 1) {
            final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC0208z.class);
            c0014o = new D4.j() { // from class: H2.l
                @Override // D4.j
                public final Object get() {
                    switch (i9) {
                        case 0:
                            return C0198o.d((Class) genericDeclarationAsSubclass2, aVar);
                        case 1:
                            return C0198o.d((Class) genericDeclarationAsSubclass2, aVar);
                        case 2:
                            return C0198o.d((Class) genericDeclarationAsSubclass2, aVar);
                        default:
                            return new P(aVar, (C0294k) ((C0196m) genericDeclarationAsSubclass2).f3205c);
                    }
                }
            };
        } else if (i7 == 2) {
            final GenericDeclaration genericDeclarationAsSubclass3 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(InterfaceC0208z.class);
            c0014o = new D4.j() { // from class: H2.l
                @Override // D4.j
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return C0198o.d((Class) genericDeclarationAsSubclass3, aVar);
                        case 1:
                            return C0198o.d((Class) genericDeclarationAsSubclass3, aVar);
                        case 2:
                            return C0198o.d((Class) genericDeclarationAsSubclass3, aVar);
                        default:
                            return new P(aVar, (C0294k) ((C0196m) genericDeclarationAsSubclass3).f3205c);
                    }
                }
            };
        } else if (i7 == 3) {
            c0014o = new C0014o(2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC0208z.class));
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException(n1.c.s(i7, "Unrecognized contentType: "));
            }
            c0014o = new D4.j() { // from class: H2.l
                @Override // D4.j
                public final Object get() {
                    switch (i8) {
                        case 0:
                            return C0198o.d((Class) this, aVar);
                        case 1:
                            return C0198o.d((Class) this, aVar);
                        case 2:
                            return C0198o.d((Class) this, aVar);
                        default:
                            return new P(aVar, (C0294k) ((C0196m) this).f3205c);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i7), c0014o);
        return c0014o;
    }

    public R4.b g(Writer writer) {
        R4.b bVar = new R4.b(writer);
        bVar.f6695t = this.f3204b;
        bVar.f6694s = false;
        bVar.f6697v = false;
        return bVar;
    }

    public String h(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                i(g(stringWriter));
                return stringWriter.toString();
            } catch (IOException e7) {
                throw new K4.o(e7);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            j(obj, cls, g(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e8) {
            throw new K4.o(e8);
        }
    }

    public void i(R4.b bVar) {
        K4.p pVar = K4.p.f4065o;
        boolean z6 = bVar.f6694s;
        bVar.f6694s = true;
        boolean z7 = bVar.f6695t;
        bVar.f6695t = this.f3204b;
        boolean z8 = bVar.f6697v;
        bVar.f6697v = false;
        try {
            try {
                N4.p pVar2 = N4.t.f5218a;
                K4.i.d(bVar, pVar);
                bVar.f6694s = z6;
                bVar.f6695t = z7;
                bVar.f6697v = z8;
            } catch (IOException e7) {
                throw new K4.o(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e8.getMessage(), e8);
            }
        } catch (Throwable th) {
            bVar.f6694s = z6;
            bVar.f6695t = z7;
            bVar.f6697v = z8;
            throw th;
        }
    }

    public void j(Object obj, Class cls, R4.b bVar) {
        K4.x xVarD = d(TypeToken.get((Type) cls));
        boolean z6 = bVar.f6694s;
        bVar.f6694s = true;
        boolean z7 = bVar.f6695t;
        bVar.f6695t = this.f3204b;
        boolean z8 = bVar.f6697v;
        bVar.f6697v = false;
        try {
            try {
                try {
                    xVarD.b(bVar, obj);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
                }
            } catch (IOException e8) {
                throw new K4.o(e8);
            }
        } finally {
            bVar.f6694s = z6;
            bVar.f6695t = z7;
            bVar.f6697v = z8;
        }
    }

    public String toString() {
        switch (this.f3203a) {
            case 2:
                return "{serializeNulls:false,factories:" + ((List) this.f3209g) + ",instanceCreators:" + ((C0001b) this.f3207e) + "}";
            default:
                return super.toString();
        }
    }

    public C0196m(Context context, L2.q qVar) {
        this.f3203a = 3;
        this.f3205c = context.getApplicationContext();
        this.f3206d = qVar;
        this.f3209g = w2.o.f18873a;
    }

    public C0196m(M4.g gVar, K4.h hVar, Map map, boolean z6, boolean z7, int i7, List list, K4.w wVar, K4.w wVar2, List list2) {
        N4.h hVar2;
        K4.i iVar;
        N4.h hVar3;
        this.f3203a = 2;
        this.f3205c = new ThreadLocal();
        this.f3206d = new ConcurrentHashMap();
        C0001b c0001b = new C0001b(map, z7, list2);
        this.f3207e = c0001b;
        this.f3204b = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(N4.t.f5241z);
        if (wVar == K4.w.f4068o) {
            hVar2 = N4.i.f5182c;
        } else {
            hVar2 = new N4.h(1, wVar);
        }
        arrayList.add(hVar2);
        arrayList.add(gVar);
        arrayList.addAll(list);
        arrayList.add(N4.t.f5231p);
        arrayList.add(N4.t.f5224g);
        arrayList.add(N4.t.f5221d);
        arrayList.add(N4.t.f5222e);
        arrayList.add(N4.t.f5223f);
        if (i7 == 1) {
            iVar = N4.t.f5227k;
        } else {
            iVar = new K4.i(2);
        }
        arrayList.add(new N4.q(Long.TYPE, Long.class, iVar));
        arrayList.add(new N4.q(Double.TYPE, Double.class, new K4.i(0)));
        arrayList.add(new N4.q(Float.TYPE, Float.class, new K4.i(1)));
        if (wVar2 == K4.w.f4069p) {
            hVar3 = N4.d.f5171d;
        } else {
            hVar3 = new N4.h(0, new N4.d(wVar2));
        }
        arrayList.add(hVar3);
        arrayList.add(N4.t.h);
        arrayList.add(N4.t.f5225i);
        arrayList.add(new N4.p(AtomicLong.class, new K4.j(new K4.j(iVar, 0), 2), 0));
        arrayList.add(new N4.p(AtomicLongArray.class, new K4.j(new K4.j(iVar, 1), 2), 0));
        arrayList.add(N4.t.f5226j);
        arrayList.add(N4.t.l);
        arrayList.add(N4.t.f5232q);
        arrayList.add(N4.t.f5233r);
        arrayList.add(new N4.p(BigDecimal.class, N4.t.f5228m, 0));
        arrayList.add(new N4.p(BigInteger.class, N4.t.f5229n, 0));
        arrayList.add(new N4.p(M4.i.class, N4.t.f5230o, 0));
        arrayList.add(N4.t.f5234s);
        arrayList.add(N4.t.f5235t);
        arrayList.add(N4.t.f5237v);
        arrayList.add(N4.t.f5238w);
        arrayList.add(N4.t.f5240y);
        arrayList.add(N4.t.f5236u);
        arrayList.add(N4.t.f5219b);
        arrayList.add(N4.d.f5170c);
        arrayList.add(N4.t.f5239x);
        if (Q4.c.f6153a) {
            arrayList.add(Q4.c.f6157e);
            arrayList.add(Q4.c.f6156d);
            arrayList.add(Q4.c.f6158f);
        }
        arrayList.add(N4.b.f5164d);
        arrayList.add(N4.t.f5218a);
        arrayList.add(new N4.c(c0001b, 0));
        arrayList.add(new N4.c(c0001b, 2));
        N4.c cVar = new N4.c(c0001b, 1);
        this.f3208f = cVar;
        arrayList.add(cVar);
        arrayList.add(N4.t.f5217A);
        arrayList.add(new N4.n(c0001b, hVar, gVar, cVar, list2));
        this.f3209g = Collections.unmodifiableList(arrayList);
    }

    public C0196m(C0294k c0294k, C0746L c0746l) {
        this.f3203a = 0;
        this.f3205c = c0294k;
        this.f3209g = c0746l;
        this.f3206d = new HashMap();
        this.f3207e = new HashMap();
        this.f3204b = true;
    }
}
