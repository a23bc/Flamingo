package p;

import R0.AbstractC0372b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import t.T;

/* JADX INFO: renamed from: p.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1268A extends AbstractC0372b implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f14732c;

    public MenuC1268A(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14732c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f14732c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f14732c.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = g(menuItemArr2[i11]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f14732c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        T t7 = (T) this.f6417b;
        if (t7 != null) {
            t7.clear();
        }
        this.f14732c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f14732c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return g(this.f14732c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return g(this.f14732c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f14732c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f14732c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i8) {
        return this.f14732c.performIdentifierAction(i7, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f14732c.performShortcut(i7, keyEvent, i8);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((T) this.f6417b) != null) {
            int i8 = 0;
            while (true) {
                T t7 = (T) this.f6417b;
                if (i8 >= t7.f16036q) {
                    break;
                }
                if (((A1.a) t7.f(i8)).getGroupId() == i7) {
                    ((T) this.f6417b).g(i8);
                    i8--;
                }
                i8++;
            }
        }
        this.f14732c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((T) this.f6417b) != null) {
            int i8 = 0;
            while (true) {
                T t7 = (T) this.f6417b;
                if (i8 >= t7.f16036q) {
                    break;
                }
                if (((A1.a) t7.f(i8)).getItemId() == i7) {
                    ((T) this.f6417b).g(i8);
                    break;
                }
                i8++;
            }
        }
        this.f14732c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z6, boolean z7) {
        this.f14732c.setGroupCheckable(i7, z6, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z6) {
        this.f14732c.setGroupEnabled(i7, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z6) {
        this.f14732c.setGroupVisible(i7, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f14732c.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14732c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.f14732c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return g(this.f14732c.add(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return this.f14732c.addSubMenu(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return g(this.f14732c.a(i7, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return this.f14732c.addSubMenu(i7, i8, i9, i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i8, int i9, int i10) {
        return g(this.f14732c.add(i7, i8, i9, i10));
    }
}
