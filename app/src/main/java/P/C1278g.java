package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import yos.music.player.R;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1278g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f14800a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1279h f14801b;

    public C1278g(C1279h c1279h) {
        this.f14801b = c1279h;
        a();
    }

    public final void a() {
        l lVar = this.f14801b.f14804q;
        n nVar = lVar.f14834v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f14823j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((n) arrayList.get(i7)) == nVar) {
                    this.f14800a = i7;
                    return;
                }
            }
        }
        this.f14800a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b */
    public final n getItem(int i7) {
        C1279h c1279h = this.f14801b;
        l lVar = c1279h.f14804q;
        lVar.i();
        ArrayList arrayList = lVar.f14823j;
        c1279h.getClass();
        int i8 = this.f14800a;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (n) arrayList.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1279h c1279h = this.f14801b;
        l lVar = c1279h.f14804q;
        lVar.i();
        int size = lVar.f14823j.size();
        c1279h.getClass();
        return this.f14800a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f14801b.f14803p.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
