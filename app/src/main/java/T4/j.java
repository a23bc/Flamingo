package T4;

import m5.AbstractC1209k;
import t.C1465u;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C1465u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i7, int i8) {
        super(i7);
        this.f6974g = i8;
    }

    @Override // t.C1465u
    public void a(Object obj) {
        switch (this.f6974g) {
            case 0:
                AbstractC1209k.f(obj, "key");
                break;
            default:
                super.a(obj);
                break;
        }
    }

    @Override // t.C1465u
    public void b(Object obj, Object obj2, Object obj3) {
        switch (this.f6974g) {
            case 0:
                AbstractC1209k.f(obj, "key");
                AbstractC1209k.f(obj2, "oldValue");
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    @Override // t.C1465u
    public int g(Object obj, Object obj2) {
        switch (this.f6974g) {
            case 0:
                AbstractC1209k.f(obj, "key");
                AbstractC1209k.f(obj2, "value");
                return 1;
            default:
                return super.g(obj, obj2);
        }
    }
}
