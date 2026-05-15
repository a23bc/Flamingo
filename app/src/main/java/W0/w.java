package w0;

import O0.InterfaceC0313j;
import Q0.AbstractC0347f;
import Q0.M;
import R0.C0415x;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f18823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f18824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M f18826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f18827u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(u uVar, u uVar2, Object obj, int i7, M m7, int i8) {
        super(1);
        this.f18822p = i8;
        this.f18823q = uVar;
        this.f18824r = uVar2;
        this.f18827u = obj;
        this.f18825s = i7;
        this.f18826t = m7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f18822p) {
            case 0:
                InterfaceC0313j interfaceC0313j = (InterfaceC0313j) obj;
                u uVar = this.f18824r;
                if (this.f18823q != ((k) ((C0415x) AbstractC0347f.y(uVar)).getFocusOwner()).h) {
                    return Boolean.TRUE;
                }
                boolean zB = f.B(uVar, (u) this.f18827u, this.f18825s, this.f18826t);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !interfaceC0313j.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC0313j interfaceC0313j2 = (InterfaceC0313j) obj;
                u uVar2 = this.f18824r;
                if (this.f18823q != ((k) ((C0415x) AbstractC0347f.y(uVar2)).getFocusOwner()).h) {
                    return Boolean.TRUE;
                }
                boolean zA = f.A(this.f18825s, this.f18826t, uVar2, (C1893c) this.f18827u);
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                if (zA || !interfaceC0313j2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
