package b2;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f10345a;

    public w0(p4.m mVar) {
        this.f10345a = Z4.y.q0(mVar.f15091o);
    }

    public static String a(String str, int i7, int i8) {
        return i7 + '-' + i8 + '-' + str;
    }

    public w0(int i7) {
        switch (i7) {
            case 2:
                this.f10345a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f10345a = new LinkedHashMap();
                break;
        }
    }
}
