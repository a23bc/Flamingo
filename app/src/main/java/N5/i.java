package N5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5256c;

    public i(ArrayList arrayList) {
        this.f5254a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC1209k.f(obj, "proxy");
        AbstractC1209k.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC1209k.a(name, "supports") && AbstractC1209k.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC1209k.a(name, "unsupported") && AbstractC1209k.a(Void.TYPE, returnType)) {
            this.f5255b = true;
            return null;
        }
        boolean zA = AbstractC1209k.a(name, "protocols");
        ArrayList arrayList = this.f5254a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC1209k.a(name, "selectProtocol") || AbstractC1209k.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        Object obj3 = list.get(i7);
                        AbstractC1209k.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i7 == size) {
                                break;
                            }
                            i7++;
                        } else {
                            this.f5256c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f5256c = str2;
                return str2;
            }
        }
        if ((!AbstractC1209k.a(name, "protocolSelected") && !AbstractC1209k.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        AbstractC1209k.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f5256c = (String) obj4;
        return null;
    }
}
