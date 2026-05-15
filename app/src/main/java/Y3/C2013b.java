package y3;

import android.content.Context;
import android.content.ContextWrapper;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: y3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2013b extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C2013b f20393q = new C2013b(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C2013b f20394r = new C2013b(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C2013b f20395s = new C2013b(1, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C2013b f20396t = new C2013b(1, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C2013b f20397u = new C2013b(1, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C2013b f20398v = new C2013b(1, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f20399p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2013b(int i7, int i8) {
        super(i7);
        this.f20399p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f20399p) {
            case 0:
                Context context = (Context) obj;
                AbstractC1209k.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                AbstractC1209k.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                s sVar = (s) obj;
                AbstractC1209k.f(sVar, "destination");
                u uVar = sVar.f20463p;
                if (uVar == null || uVar.f20474x != sVar.f20467t) {
                    return null;
                }
                return uVar;
            case 3:
                s sVar2 = (s) obj;
                AbstractC1209k.f(sVar2, "destination");
                u uVar2 = sVar2.f20463p;
                if (uVar2 == null || uVar2.f20474x != sVar2.f20467t) {
                    return null;
                }
                return uVar2;
            case 4:
                s sVar3 = (s) obj;
                AbstractC1209k.f(sVar3, "it");
                return sVar3.f20463p;
            default:
                s sVar4 = (s) obj;
                AbstractC1209k.f(sVar4, "it");
                if (!(sVar4 instanceof u)) {
                    return null;
                }
                u uVar3 = (u) sVar4;
                return uVar3.n(uVar3.f20474x, true);
        }
    }
}
