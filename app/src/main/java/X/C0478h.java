package X;

import android.graphics.drawable.Drawable;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import v4.C1639b;
import y0.C1973f;
import y0.C1980m;

/* JADX INFO: renamed from: X.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0478h implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8073o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f8074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f8075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8077s;

    public /* synthetic */ C0478h(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC1180a interfaceC1180a, boolean z6) {
        this.f8076r = interfaceC0878b0;
        this.f8077s = interfaceC0878b02;
        this.f8074p = interfaceC1180a;
        this.f8075q = z6;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f8073o) {
            case 0:
                Q0.N n7 = (Q0.N) obj;
                n7.a();
                if (((Boolean) this.f8074p.a()).booleanValue()) {
                    C1973f c1973f = (C1973f) this.f8076r;
                    C1980m c1980m = (C1980m) this.f8077s;
                    A0.c cVar = n7.f5853o;
                    if (this.f8075q) {
                        long jR = cVar.R();
                        A0.b bVar = cVar.f54p;
                        long jW = bVar.W();
                        bVar.S().l();
                        try {
                            ((A.b) bVar.f50p).E(-1.0f, 1.0f, jR);
                            cVar.d(c1973f, c1980m);
                        } finally {
                            n1.c.A(bVar, jW);
                        }
                    } else {
                        cVar.d(c1973f, c1980m);
                    }
                }
                return Y4.o.f8736a;
            default:
                C1639b c1639b = (C1639b) obj;
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f8076r;
                AbstractC1209k.f(interfaceC0878b0, "$drawable");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f8077s;
                AbstractC1209k.f(interfaceC0878b02, "$lastOption");
                InterfaceC1180a interfaceC1180a = this.f8074p;
                AbstractC1209k.f(interfaceC1180a, "$isPlaying");
                AbstractC1209k.f(c1639b, "it");
                if (interfaceC0878b0.getValue() != null) {
                    if (AbstractC1209k.a(c1639b.getDrawable(), interfaceC0878b0.getValue())) {
                        if (((Boolean) interfaceC1180a.a()).booleanValue() && this.f8075q) {
                            if (!AbstractC1209k.a(interfaceC0878b02.getValue(), "Resume")) {
                                System.out.getClass();
                                c1639b.f18298v = false;
                                c1639b.f18297u = System.currentTimeMillis();
                                c1639b.invalidate();
                                interfaceC0878b02.setValue("Resume");
                            }
                        } else if (!AbstractC1209k.a(interfaceC0878b02.getValue(), "Pause")) {
                            System.out.getClass();
                            c1639b.f18298v = true;
                            interfaceC0878b02.setValue("Pause");
                        }
                    } else if (!AbstractC1209k.a(interfaceC0878b02.getValue(), "Set")) {
                        System.out.getClass();
                        Object value = interfaceC0878b0.getValue();
                        AbstractC1209k.c(value);
                        c1639b.setImageDrawable((Drawable) value);
                        interfaceC0878b02.setValue("Set");
                    }
                }
                return Y4.o.f8736a;
        }
    }

    public /* synthetic */ C0478h(InterfaceC1180a interfaceC1180a, boolean z6, C1973f c1973f, C1980m c1980m) {
        this.f8074p = interfaceC1180a;
        this.f8075q = z6;
        this.f8076r = c1973f;
        this.f8077s = c1980m;
    }
}
