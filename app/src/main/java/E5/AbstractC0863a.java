package e5;

import d5.EnumC0830a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863a implements c5.d, InterfaceC0866d, Serializable {
    private final c5.d completion;

    public AbstractC0863a(c5.d dVar) {
        this.completion = dVar;
    }

    public c5.d create(Object obj, c5.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC0866d getCallerFrame() {
        c5.d dVar = this.completion;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    public final c5.d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        InterfaceC0867e interfaceC0867e = (InterfaceC0867e) getClass().getAnnotation(InterfaceC0867e.class);
        String str = null;
        if (interfaceC0867e == null) {
            return null;
        }
        int iV = interfaceC0867e.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? interfaceC0867e.l()[iIntValue] : -1;
        O5.i iVar = AbstractC0868f.f11603b;
        O5.i iVar2 = AbstractC0868f.f11602a;
        if (iVar == null) {
            try {
                O5.i iVar3 = new O5.i(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                AbstractC0868f.f11603b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                AbstractC0868f.f11603b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f5680a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = iVar.f5681b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = iVar.f5682c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = interfaceC0867e.c();
        } else {
            strC = str + '/' + interfaceC0867e.c();
        }
        return new StackTraceElement(strC, interfaceC0867e.m(), interfaceC0867e.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // c5.d
    public final void resumeWith(Object obj) {
        c5.d dVar = this;
        while (true) {
            AbstractC0863a abstractC0863a = (AbstractC0863a) dVar;
            c5.d dVar2 = abstractC0863a.completion;
            AbstractC1209k.c(dVar2);
            try {
                obj = abstractC0863a.invokeSuspend(obj);
                if (obj == EnumC0830a.f11264o) {
                    return;
                }
            } catch (Throwable th) {
                obj = android.support.v4.media.session.b.l(th);
            }
            abstractC0863a.releaseIntercepted();
            if (!(dVar2 instanceof AbstractC0863a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public void releaseIntercepted() {
    }
}
