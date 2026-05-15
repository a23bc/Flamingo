package w0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m f18793q = new m(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f18794r = new m(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f18795s = new m(1, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18796p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f18796p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f18796p) {
            case 0:
                break;
            case 1:
                break;
        }
        return Boolean.valueOf(((u) obj).F0(7));
    }
}
