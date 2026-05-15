package t5;

import java.util.Iterator;
import l0.C1159c;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import u5.C1540b;

/* JADX INFO: renamed from: t5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1523g implements InterfaceC1524h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17102a;

    /* JADX INFO: renamed from: b */
    public final Object f17103b;

    /* JADX INFO: renamed from: c */
    public final Object f17104c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1523g(InterfaceC1524h interfaceC1524h, InterfaceC1182c interfaceC1182c, int i7) {
        this.f17102a = i7;
        switch (i7) {
            case 2:
                this.f17103b = interfaceC1524h;
                this.f17104c = interfaceC1182c;
                break;
            default:
                this.f17104c = interfaceC1524h;
                this.f17103b = (AbstractC1210l) interfaceC1182c;
                break;
        }
    }

    @Override // t5.InterfaceC1524h
    public final Iterator iterator() {
        switch (this.f17102a) {
            case 0:
                return new C1159c(this);
            case 1:
                return new C1521e(this);
            case 2:
                return new n(this);
            default:
                return new C1540b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1523g(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c) {
        this.f17102a = 0;
        this.f17103b = (AbstractC1210l) interfaceC1180a;
        this.f17104c = interfaceC1182c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1523g(String str, l5.e eVar) {
        this.f17102a = 3;
        AbstractC1209k.f(str, "input");
        this.f17104c = str;
        this.f17103b = (AbstractC1210l) eVar;
    }
}
