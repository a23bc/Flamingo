package r0;

import m5.AbstractC1210l;

/* JADX INFO: renamed from: r0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1391i extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1391i f15629p = new C1391i(2);

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC1396n interfaceC1396n = (InterfaceC1396n) obj2;
        if (str.length() == 0) {
            return interfaceC1396n.toString();
        }
        return str + ", " + interfaceC1396n;
    }
}
