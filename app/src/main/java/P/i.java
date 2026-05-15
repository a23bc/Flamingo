package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14809b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f14812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14813f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z6, int i7) {
        this.f14811d = z6;
        this.f14812e = layoutInflater;
        this.f14808a = lVar;
        this.f14813f = i7;
        a();
    }

    public final void a() {
        l lVar = this.f14808a;
        n nVar = lVar.f14834v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f14823j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((n) arrayList.get(i7)) == nVar) {
                    this.f14809b = i7;
                    return;
                }
            }
        }
        this.f14809b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i7) {
        ArrayList arrayListL;
        l lVar = this.f14808a;
        if (this.f14811d) {
            lVar.i();
            arrayListL = lVar.f14823j;
        } else {
            arrayListL = lVar.l();
        }
        int i8 = this.f14809b;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return (n) arrayListL.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        l lVar = this.f14808a;
        if (this.f14811d) {
            lVar.i();
            arrayListL = lVar.f14823j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f14809b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f14812e.inflate(this.f14813f, viewGroup, false);
        }
        int i8 = getItem(i7).f14844b;
        int i9 = i7 - 1;
        int i10 = i9 >= 0 ? getItem(i9).f14844b : i8;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14808a.m() && i8 != i10) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        y yVar = (y) view;
        if (this.f14810c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
