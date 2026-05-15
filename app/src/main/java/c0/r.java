package c0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ViewGroup {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f10590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f10591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V1.a f10592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10593s;

    public r(Context context) {
        super(context);
        this.f10589o = 5;
        ArrayList arrayList = new ArrayList();
        this.f10590p = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10591q = arrayList2;
        this.f10592r = new V1.a(6);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f10593s = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(s sVar) throws Exception {
        V1.a aVar = this.f10592r;
        t tVar = (t) ((LinkedHashMap) aVar.f7389o).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        ArrayList arrayList = this.f10591q;
        AbstractC1209k.f(arrayList, "<this>");
        t tVar2 = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f7389o;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) aVar.f7390p;
        if (tVar2 == null) {
            int i7 = this.f10593s;
            ArrayList arrayList2 = this.f10590p;
            if (i7 > Z4.o.d0(arrayList2)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList2.add(tVar2);
            } else {
                tVar2 = (t) arrayList2.get(this.f10593s);
                s sVar2 = (s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.c0();
                    t tVar3 = (t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i8 = this.f10593s;
            if (i8 < this.f10589o - 1) {
                this.f10593s = i8 + 1;
            } else {
                this.f10593s = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }
}
