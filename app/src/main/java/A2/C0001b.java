package A2;

import L2.C0247a;
import X.InterfaceC0488m;
import X.K0;
import a.AbstractC0509a;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import g1.C0980v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import m5.AbstractC1209k;
import t.C1463s;
import w3.A0;
import w3.C1747r0;
import w3.C1749s0;
import w3.RunnableC1734k0;
import yos.music.player.logic.YosPlaybackService;
import z4.ViewOnAttachStateChangeListenerC2094m;

/* JADX INFO: renamed from: A2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0001b implements InterfaceC0488m, I4.s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f221o;

    /* JADX INFO: renamed from: p */
    public boolean f222p;

    /* JADX INFO: renamed from: q */
    public Object f223q;

    /* JADX INFO: renamed from: r */
    public final Object f224r;

    public C0001b(C1463s c1463s, V.o oVar) {
        this.f221o = 1;
        this.f223q = c1463s;
        this.f224r = oVar;
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    @Override // X.InterfaceC0488m
    public void a() {
        if (this.f222p) {
            K0.a((K0) this.f224r, (b1.L) this.f223q);
        }
    }

    @Override // X.InterfaceC0488m
    public boolean b(long j3, X.F f7, int i7) {
        M.Z z6;
        K0 k02 = (K0) this.f224r;
        if (!k02.j() || k02.m().f12384a.f9970p.length() == 0 || (z6 = k02.f7942d) == null || z6.d() == null) {
            return false;
        }
        w0.p pVar = k02.f7948k;
        if (pVar != null) {
            w0.p.b(pVar);
        }
        k02.f7950n = j3;
        k02.f7955s = -1;
        k02.h(true);
        long j7 = j(k02.m(), k02.f7950n, true, f7);
        if (i7 >= 2) {
            this.f222p = true;
            this.f223q = new b1.L(j7);
        }
        return true;
    }

    @Override // X.InterfaceC0488m
    public boolean c(long j3, X.F f7) {
        M.Z z6;
        K0 k02 = (K0) this.f224r;
        if (!k02.j() || k02.m().f12384a.f9970p.length() == 0 || (z6 = k02.f7942d) == null || z6.d() == null) {
            return false;
        }
        j(k02.m(), j3, false, f7);
        return true;
    }

    public boolean d(long j3) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((V.o) this.f224r).f7342p;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            if (K0.t.d(((K0.w) obj).f3926a, j3)) {
                break;
            }
            i7++;
        }
        K0.w wVar = (K0.w) obj;
        if (wVar != null) {
            return wVar.h;
        }
        return false;
    }

    @Override // I4.s
    public void g(Object obj) {
        A0 a0 = ((w3.K0) this.f224r).f19002g;
        Handler handler = a0.l;
        C1747r0 c1747r0 = (C1747r0) this.f223q;
        w2.t.G(handler, new RunnableC0022x(a0, c1747r0, new RunnableC1734k0(this, (C1749s0) obj, this.f222p, c1747r0)));
    }

    public M4.o h(TypeToken typeToken) {
        String str;
        M4.o uVar;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.f223q;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(rawType) != null) {
            throw new ClassCastException();
        }
        x0 x0Var = null;
        M4.e eVar = EnumSet.class.isAssignableFrom(rawType) ? new M4.e(type, 0) : rawType == EnumMap.class ? new M4.e(type, 1) : null;
        if (eVar != null) {
            return eVar;
        }
        M4.d.e((List) this.f224r);
        if (Modifier.isAbstract(rawType.getModifiers())) {
            uVar = null;
        } else {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                AbstractC0509a abstractC0509a = P4.c.f5763a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e7) {
                    str = "Failed making constructor '" + P4.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage();
                }
                uVar = str != null ? new B5.u(str, 5) : new C0247a(4, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                uVar = null;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            x0Var = SortedSet.class.isAssignableFrom(rawType) ? new x0(19) : Set.class.isAssignableFrom(rawType) ? new x0(20) : Queue.class.isAssignableFrom(rawType) ? new x0(21) : new x0(22);
        } else if (Map.class.isAssignableFrom(rawType)) {
            x0Var = ConcurrentNavigableMap.class.isAssignableFrom(rawType) ? new x0(23) : ConcurrentMap.class.isAssignableFrom(rawType) ? new x0(24) : SortedMap.class.isAssignableFrom(rawType) ? new x0(25) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new x0(27) : new x0(26);
        }
        if (x0Var != null) {
            return x0Var;
        }
        String strE = e(rawType);
        if (strE != null) {
            return new B5.u(strE, 4);
        }
        if (this.f222p) {
            return new C0247a(3, rawType);
        }
        return new B5.u("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 3);
    }

    public void i(boolean z6) {
        RunnableC0000a runnableC0000a = (RunnableC0000a) this.f224r;
        Context context = (Context) this.f223q;
        if (z6 && !this.f222p) {
            context.registerReceiver(runnableC0000a, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f222p = true;
        } else {
            if (z6 || !this.f222p) {
                return;
            }
            context.unregisterReceiver(runnableC0000a);
            this.f222p = false;
        }
    }

    public long j(C0980v c0980v, long j3, boolean z6, X.F f7) {
        long jC = K0.c((K0) this.f224r, c0980v, j3, z6, false, f7, false);
        if (!b1.L.a(jC, (b1.L) this.f223q)) {
            this.f222p = false;
        }
        ((K0) this.f224r).p(b1.L.c(jC) ? M.N.f4427q : M.N.f4426p);
        return jC;
    }

    public String toString() {
        switch (this.f221o) {
            case 2:
                return ((Map) this.f223q).toString();
            default:
                return super.toString();
        }
    }

    public C0001b(YosPlaybackService yosPlaybackService, Handler handler, K k7) {
        this.f221o = 0;
        this.f223q = yosPlaybackService.getApplicationContext();
        this.f224r = new RunnableC0000a(this, handler, k7);
    }

    public C0001b(Map map, boolean z6, List list) {
        this.f221o = 2;
        this.f223q = map;
        this.f222p = z6;
        this.f224r = list;
    }

    public C0001b(View view) {
        this.f221o = 5;
        AbstractC1209k.f(view, "view");
        this.f223q = view;
        this.f224r = new ViewOnAttachStateChangeListenerC2094m();
    }

    public C0001b(K0 k02) {
        this.f221o = 3;
        this.f224r = k02;
        this.f222p = true;
    }

    public C0001b(w3.K0 k02, C1747r0 c1747r0, boolean z6) {
        this.f221o = 4;
        this.f224r = k02;
        this.f223q = c1747r0;
        this.f222p = z6;
    }

    @Override // I4.s
    public void f(Throwable th) {
    }
}
