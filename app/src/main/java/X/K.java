package X;

import F.C0130c;
import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;
import y.AbstractC1950f;
import y.C1947c;
import yos.music.player.data.libraries.Folder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f7934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y4.c f7937t;

    public /* synthetic */ K(Object obj, Object obj2, Object obj3, Y4.c cVar, int i7, int i8) {
        this.f7932o = i8;
        this.f7934q = obj;
        this.f7935r = obj2;
        this.f7936s = obj3;
        this.f7937t = cVar;
        this.f7933p = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7932o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(this.f7933p | 1);
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) this.f7934q;
                n0.d dVar = (n0.d) this.f7937t;
                AbstractC0498r0.c(interfaceC1398p, (E) this.f7935r, (InterfaceC1182c) this.f7936s, dVar, (C0912t) obj, iB);
                break;
            case 1:
                ((Integer) obj2).intValue();
                C0130c c0130c = (C0130c) this.f7934q;
                AbstractC1209k.f(c0130c, "$this_PlayListItem");
                l6.a aVar = (l6.a) this.f7935r;
                AbstractC1209k.f(aVar, "$playListType");
                String str = (String) this.f7936s;
                AbstractC1209k.f(str, "$title");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f7937t;
                AbstractC1209k.f(interfaceC1180a, "$itemClick");
                i6.h.f(c0130c, aVar, str, interfaceC1180a, (C0912t) obj, C0879c.B(this.f7933p | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iB2 = C0879c.B(this.f7933p) | 1;
                T.b bVar = (T.b) this.f7934q;
                T.e eVar = (T.e) this.f7935r;
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f7936s;
                ((n0.d) this.f7937t).f(bVar, eVar, interfaceC1180a2, (C0912t) obj, iB2);
                break;
            case 3:
                ((Integer) obj2).intValue();
                C0130c c0130c2 = (C0130c) this.f7934q;
                AbstractC1209k.f(c0130c2, "$this_FolderItem");
                Folder folder = (Folder) this.f7935r;
                AbstractC1209k.f(folder, "$folder");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f7936s;
                AbstractC1209k.f(interfaceC1180a3, "$itemLongClick");
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f7937t;
                AbstractC1209k.f(interfaceC1180a4, "$itemClick");
                j0.k.c(c0130c2, folder, interfaceC1180a3, interfaceC1180a4, (C0912t) obj, C0879c.B(this.f7933p | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iB3 = C0879c.B(this.f7933p | 1);
                InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) this.f7937t;
                AbstractC1950f.c((String) this.f7934q, (C1947c) this.f7935r, (l5.f) this.f7936s, interfaceC1180a5, (C0912t) obj, iB3);
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ K(n0.d dVar, T.b bVar, T.e eVar, InterfaceC1180a interfaceC1180a, int i7) {
        this.f7932o = 2;
        this.f7937t = dVar;
        this.f7934q = bVar;
        this.f7935r = eVar;
        this.f7936s = interfaceC1180a;
        this.f7933p = i7;
    }
}
