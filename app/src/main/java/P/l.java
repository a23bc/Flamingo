package p;

import G1.J;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f14814y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f14815a;

    /* JADX INFO: renamed from: b */
    public final Resources f14816b;

    /* JADX INFO: renamed from: c */
    public boolean f14817c;

    /* JADX INFO: renamed from: d */
    public final boolean f14818d;

    /* JADX INFO: renamed from: e */
    public j f14819e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f14820f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f14821g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f14822i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f14823j;

    /* JADX INFO: renamed from: k */
    public boolean f14824k;

    /* JADX INFO: renamed from: m */
    public CharSequence f14825m;

    /* JADX INFO: renamed from: n */
    public Drawable f14826n;

    /* JADX INFO: renamed from: o */
    public View f14827o;

    /* JADX INFO: renamed from: v */
    public n f14834v;

    /* JADX INFO: renamed from: x */
    public boolean f14836x;
    public int l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f14828p = false;

    /* JADX INFO: renamed from: q */
    public boolean f14829q = false;

    /* JADX INFO: renamed from: r */
    public boolean f14830r = false;

    /* JADX INFO: renamed from: s */
    public boolean f14831s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f14832t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f14833u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f14835w = false;

    public l(Context context) {
        boolean zQ;
        boolean z6 = false;
        this.f14815a = context;
        Resources resources = context.getResources();
        this.f14816b = resources;
        this.f14820f = new ArrayList();
        this.f14821g = new ArrayList();
        this.h = true;
        this.f14822i = new ArrayList();
        this.f14823j = new ArrayList();
        this.f14824k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = J.f2646a;
            if (Build.VERSION.SDK_INT >= 28) {
                zQ = B1.d.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zQ = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zQ) {
                z6 = true;
            }
        }
        this.f14818d = z6;
    }

    public final n a(int i7, int i8, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f14814y[i11] << 16) | (65535 & i9);
        n nVar = new n(this, i7, i8, i9, i12, charSequence, this.l);
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f14846d <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f14815a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i7, i8, i9, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f14849g = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f14833u.add(new WeakReference(xVar));
        xVar.g(context, this);
        this.f14824k = true;
    }

    public final void c(boolean z6) {
        if (this.f14831s) {
            return;
        }
        this.f14831s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z6);
            }
        }
        this.f14831s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f14834v;
        if (nVar != null) {
            d(nVar);
        }
        this.f14820f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f14826n = null;
        this.f14825m = null;
        this.f14827o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14834v == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zK = xVar.k(nVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f14834v = null;
            }
        }
        return zK;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f14819e;
        return jVar != null && jVar.x(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zH = xVar.h(nVar);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zH) {
            this.f14834v = nVar;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) arrayList.get(i8);
            if (nVar.f14843a == i7) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f14855o.findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f14832t;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) arrayList.get(i8);
            char c7 = zN ? nVar.f14851j : nVar.h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (zN && c7 == '\b' && i7 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f14820f.get(i7);
    }

    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList2 = this.f14820f;
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                n nVar = (n) arrayList2.get(i8);
                if (nVar.hasSubMenu()) {
                    nVar.f14855o.h(arrayList, i7, keyEvent);
                }
                char c7 = zN ? nVar.f14851j : nVar.h;
                if ((modifiers & 69647) == ((zN ? nVar.f14852k : nVar.f14850i) & 69647) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c7 == cArr[0] || c7 == cArr[2] || (zN && c7 == '\b' && i7 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f14836x) {
            return true;
        }
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((n) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f14824k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
            boolean zI = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zI |= xVar.i();
                }
            }
            ArrayList arrayList = this.f14822i;
            ArrayList arrayList2 = this.f14823j;
            if (zI) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i7 = 0; i7 < size; i7++) {
                    n nVar = (n) arrayListL.get(i7);
                    if ((nVar.f14864x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f14824k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z6 = this.h;
        ArrayList arrayList = this.f14821g;
        if (!z6) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f14820f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) arrayList2.get(i7);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.h = false;
        this.f14824k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f14835w;
    }

    public boolean n() {
        return this.f14817c;
    }

    public boolean o() {
        return this.f14818d;
    }

    public final void p(boolean z6) {
        if (this.f14828p) {
            this.f14829q = true;
            if (z6) {
                this.f14830r = true;
                return;
            }
            return;
        }
        if (z6) {
            this.h = true;
            this.f14824k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.d();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return q(findItem(i7), null, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        n nVarG = g(i7, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i8) : false;
        if ((i8 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, p.x r8, int r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l.q(android.view.MenuItem, p.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14833u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((n) arrayList.get(i9)).f14844b == i7) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i8 + 1;
                if (i8 >= size2 || ((n) arrayList.get(i9)).f14844b != i7) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f14820f;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i8 = i10;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((n) arrayList.get(i8)).f14843a == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            ArrayList arrayList2 = this.f14820f;
            if (i8 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i8);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f14820f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1271D) item.getSubMenu()).s(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (menuItemFindItem = findItem(i8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z6, boolean z7) {
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) arrayList.get(i8);
            if (nVar.f14844b == i7) {
                nVar.f14864x = (nVar.f14864x & (-5)) | (z7 ? 4 : 0);
                nVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f14835w = z6;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z6) {
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) arrayList.get(i8);
            if (nVar.f14844b == i7) {
                nVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z6) {
        ArrayList arrayList = this.f14820f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            n nVar = (n) arrayList.get(i8);
            if (nVar.f14844b == i7) {
                int i9 = nVar.f14864x;
                int i10 = (i9 & (-9)) | (z6 ? 0 : 8);
                nVar.f14864x = i10;
                if (i9 != i10) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f14817c = z6;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14820f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f14820f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1271D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        if (view != null) {
            this.f14827o = view;
            this.f14825m = null;
            this.f14826n = null;
        } else {
            if (i7 > 0) {
                this.f14825m = this.f14816b.getText(i7);
            } else if (charSequence != null) {
                this.f14825m = charSequence;
            }
            if (i8 > 0) {
                this.f14826n = this.f14815a.getDrawable(i8);
            } else if (drawable != null) {
                this.f14826n = drawable;
            }
            this.f14827o = null;
        }
        p(false);
    }

    public final void v() {
        this.f14828p = false;
        if (this.f14829q) {
            this.f14829q = false;
            p(this.f14830r);
        }
    }

    public final void w() {
        if (this.f14828p) {
            return;
        }
        this.f14828p = true;
        this.f14829q = false;
        this.f14830r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f14816b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f14816b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        n nVarA = a(i7, i8, i9, charSequence);
        SubMenuC1271D subMenuC1271D = new SubMenuC1271D(this.f14815a, this, nVarA);
        nVarA.f14855o = subMenuC1271D;
        subMenuC1271D.setHeaderTitle(nVarA.f14847e);
        return subMenuC1271D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f14816b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f14816b.getString(i10));
    }

    public l k() {
        return this;
    }
}
