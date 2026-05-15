package c2;

import a2.C0516f;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: c2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0728c extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0728c f10656q = new C0728c(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0728c f10657r = new C0728c(1, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10658p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0728c(int i7, int i8) {
        super(i7);
        this.f10658p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f10658p) {
        }
        return (C0516f) obj;
    }
}
