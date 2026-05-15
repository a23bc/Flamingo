package k;

import G1.InterfaceC0143j;
import L2.C0247a;
import R0.C0408t0;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0599w;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.EnumC0593p;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import d.AbstractActivityC0759l;
import g.C0938e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractActivityC1121i;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import q.C1336s;
import q.b1;
import q.g1;
import u1.InterfaceC1529a;
import v1.InterfaceC1632b;
import v1.InterfaceC1633c;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1121i extends AbstractActivityC0759l implements InterfaceC1122j, InterfaceC1529a {

    /* JADX INFO: renamed from: J */
    public boolean f13918J;

    /* JADX INFO: renamed from: K */
    public boolean f13919K;

    /* JADX INFO: renamed from: M */
    public LayoutInflaterFactory2C1111A f13921M;

    /* JADX INFO: renamed from: H */
    public final C0247a f13916H = new C0247a(18, new Y1.g(this));

    /* JADX INFO: renamed from: I */
    public final C0599w f13917I = new C0599w(this, true);

    /* JADX INFO: renamed from: L */
    public boolean f13920L = true;

    public AbstractActivityC1121i() {
        ((V.o) this.f10786r.f7343q).G("android:support:lifecycle", new C0408t0(1, this));
        final int i7 = 0;
        this.f10791w.add(new F1.a(this) { // from class: Y1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1121i f8594b;

            {
                this.f8594b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i7) {
                    case 0:
                        this.f8594b.f13916H.m();
                        break;
                    default:
                        this.f8594b.f13916H.m();
                        break;
                }
            }
        });
        final int i8 = 1;
        this.f10793y.add(new F1.a(this) { // from class: Y1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1121i f8594b;

            {
                this.f8594b = this;
            }

            @Override // F1.a
            public final void c(Object obj) {
                switch (i8) {
                    case 0:
                        this.f8594b.f13916H.m();
                        break;
                    default:
                        this.f8594b.f13916H.m();
                        break;
                }
            }
        });
        j(new Y1.f(this, 0));
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        layoutInflaterFactory2C1111A.t();
        ((ViewGroup) layoutInflaterFactory2C1111A.f13794P.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1111A.f13779A.a(layoutInflaterFactory2C1111A.f13826z.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00a7  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractActivityC1121i.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C1111A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // u1.f, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C1111A) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractActivityC1121i.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i7) {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        layoutInflaterFactory2C1111A.t();
        return layoutInflaterFactory2C1111A.f13826z.findViewById(i7);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        if (layoutInflaterFactory2C1111A.f13782D == null) {
            layoutInflaterFactory2C1111A.z();
            K k7 = layoutInflaterFactory2C1111A.f13781C;
            layoutInflaterFactory2C1111A.f13782D = new o.h(k7 != null ? k7.Q() : layoutInflaterFactory2C1111A.f13825y);
        }
        return layoutInflaterFactory2C1111A.f13782D;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i7 = g1.f15315a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        if (layoutInflaterFactory2C1111A.f13781C != null) {
            layoutInflaterFactory2C1111A.z();
            layoutInflaterFactory2C1111A.f13781C.getClass();
            layoutInflaterFactory2C1111A.A(0);
        }
    }

    public final o l() {
        if (this.f13921M == null) {
            m mVar = o.f13926o;
            this.f13921M = new LayoutInflaterFactory2C1111A(this, null, this, this);
        }
        return this.f13921M;
    }

    public final void m() {
        androidx.lifecycle.K.m(getWindow().getDecorView(), this);
        androidx.lifecycle.K.n(getWindow().getDecorView(), this);
        AbstractC1267a.K(getWindow().getDecorView(), this);
        N5.l.O(getWindow().getDecorView(), this);
    }

    public final void n() {
        super.onDestroy();
        Y1.q qVar = ((Y1.g) this.f13916H.f4105p).f8599q;
        boolean zIsChangingConfigurations = true;
        qVar.f8618A = true;
        qVar.e(true);
        Iterator it = qVar.b().iterator();
        if (it.hasNext()) {
            ((Y1.x) it.next()).a();
            throw null;
        }
        Y1.g gVar = qVar.f8639r;
        boolean z6 = gVar instanceof Y;
        U3.h hVar = qVar.f8626c;
        if (z6) {
            zIsChangingConfigurations = ((Y1.t) hVar.f7045r).f8662e;
        } else {
            AbstractActivityC1121i abstractActivityC1121i = gVar.f8597o;
            if (abstractActivityC1121i instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC1121i.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = qVar.f8631i.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((Y1.c) it2.next()).f8591o) {
                    Y1.t tVar = (Y1.t) hVar.f7045r;
                    tVar.getClass();
                    Y1.q.h(3);
                    HashMap map = tVar.f8660c;
                    Y1.t tVar2 = (Y1.t) map.get(str);
                    if (tVar2 != null) {
                        tVar2.d();
                        map.remove(str);
                    }
                    HashMap map2 = tVar.f8661d;
                    X x6 = (X) map2.get(str);
                    if (x6 != null) {
                        x6.a();
                        map2.remove(str);
                    }
                }
            }
        }
        qVar.c(-1);
        Y1.g gVar2 = qVar.f8639r;
        if (gVar2 instanceof InterfaceC1633c) {
            AbstractActivityC1121i abstractActivityC1121i2 = gVar2.f8600r;
            Y1.j jVar = qVar.f8634m;
            AbstractC1209k.f(jVar, "listener");
            abstractActivityC1121i2.f10792x.remove(jVar);
        }
        Y1.g gVar3 = qVar.f8639r;
        if (gVar3 instanceof InterfaceC1632b) {
            AbstractActivityC1121i abstractActivityC1121i3 = gVar3.f8600r;
            Y1.j jVar2 = qVar.l;
            AbstractC1209k.f(jVar2, "listener");
            abstractActivityC1121i3.f10791w.remove(jVar2);
        }
        Y1.g gVar4 = qVar.f8639r;
        if (gVar4 instanceof u1.s) {
            AbstractActivityC1121i abstractActivityC1121i4 = gVar4.f8600r;
            Y1.j jVar3 = qVar.f8635n;
            AbstractC1209k.f(jVar3, "listener");
            abstractActivityC1121i4.f10794z.remove(jVar3);
        }
        Y1.g gVar5 = qVar.f8639r;
        if (gVar5 instanceof u1.t) {
            AbstractActivityC1121i abstractActivityC1121i5 = gVar5.f8600r;
            Y1.j jVar4 = qVar.f8636o;
            AbstractC1209k.f(jVar4, "listener");
            abstractActivityC1121i5.f10778A.remove(jVar4);
        }
        Y1.g gVar6 = qVar.f8639r;
        if (gVar6 instanceof InterfaceC0143j) {
            AbstractActivityC1121i abstractActivityC1121i6 = gVar6.f8600r;
            Y1.m mVar = qVar.f8637p;
            AbstractC1209k.f(mVar, "provider");
            A0.b bVar = abstractActivityC1121i6.f10785q;
            ((CopyOnWriteArrayList) bVar.f51q).remove(mVar);
            if (((HashMap) bVar.f52r).remove(mVar) != null) {
                throw new ClassCastException();
            }
            ((Runnable) bVar.f50p).run();
        }
        qVar.f8639r = null;
        qVar.f8640s = null;
        if (qVar.f8629f != null) {
            qVar.f8630g.b();
            qVar.f8629f = null;
        }
        C0938e c0938e = qVar.f8642u;
        if (c0938e != null) {
            c0938e.k0();
            qVar.f8643v.k0();
            qVar.f8644w.k0();
        }
        this.f13917I.r(EnumC0592o.ON_DESTROY);
    }

    public final boolean o(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 6) {
            return false;
        }
        Y1.q qVar = ((Y1.g) this.f13916H.f4105p).f8599q;
        if (qVar.f8638q < 1) {
            return false;
        }
        Iterator it = qVar.f8626c.U().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return false;
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        this.f13916H.m();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        if (layoutInflaterFactory2C1111A.f13799U && layoutInflaterFactory2C1111A.f13793O) {
            layoutInflaterFactory2C1111A.z();
            K k7 = layoutInflaterFactory2C1111A.f13781C;
            if (k7 != null) {
                k7.T(k7.f13855b.getResources().getBoolean(yos.music.player.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1336s c1336sA = C1336s.a();
        Context context = layoutInflaterFactory2C1111A.f13825y;
        synchronized (c1336sA) {
            c1336sA.f15390a.l(context);
        }
        layoutInflaterFactory2C1111A.f13808g0 = new Configuration(layoutInflaterFactory2C1111A.f13825y.getResources().getConfiguration());
        layoutInflaterFactory2C1111A.j(false, false);
    }

    @Override // d.AbstractActivityC0759l, u1.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13917I.r(EnumC0592o.ON_CREATE);
        Y1.q qVar = ((Y1.g) this.f13916H.f4105p).f8599q;
        qVar.f8646y = false;
        qVar.f8647z = false;
        qVar.f8622E.getClass();
        qVar.c(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Y1.h hVar = (Y1.h) ((Y1.g) this.f13916H.f4105p).f8599q.f8628e.onCreateView(view, str, context, attributeSet);
        return hVar == null ? super.onCreateView(view, str, context, attributeSet) : hVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        n();
        l().c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        Intent intentB;
        if (!o(i7, menuItem)) {
            LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
            layoutInflaterFactory2C1111A.z();
            K k7 = layoutInflaterFactory2C1111A.f13781C;
            if (menuItem.getItemId() != 16908332 || k7 == null || (((b1) k7.f13859f).f15265b & 4) == 0 || (intentB = u1.d.b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            u1.v vVar = new u1.v(this);
            Intent intentB2 = u1.d.b(this);
            if (intentB2 == null) {
                intentB2 = u1.d.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(vVar.f17199p.getPackageManager());
                }
                vVar.a(component);
                vVar.f17198o.add(intentB2);
            }
            vVar.b();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f13919K = false;
        ((Y1.g) this.f13916H.f4105p).f8599q.c(5);
        this.f13917I.r(EnumC0592o.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1111A) l()).t();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        p();
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 != null) {
            k7.f13872u = true;
        }
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f13916H.m();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0247a c0247a = this.f13916H;
        c0247a.m();
        super.onResume();
        this.f13919K = true;
        ((Y1.g) c0247a.f4105p).f8599q.e(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        q();
        ((LayoutInflaterFactory2C1111A) l()).j(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f13916H.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        r();
        LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = (LayoutInflaterFactory2C1111A) l();
        layoutInflaterFactory2C1111A.z();
        K k7 = layoutInflaterFactory2C1111A.f13781C;
        if (k7 != null) {
            k7.f13872u = false;
            o.j jVar = k7.f13871t;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        l().i(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C1111A) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onPostResume();
        this.f13917I.r(EnumC0592o.ON_RESUME);
        Y1.q qVar = ((Y1.g) this.f13916H.f4105p).f8599q;
        qVar.f8646y = false;
        qVar.f8647z = false;
        qVar.f8622E.getClass();
        qVar.c(7);
    }

    public final void q() {
        C0247a c0247a = this.f13916H;
        c0247a.m();
        super.onStart();
        this.f13920L = false;
        boolean z6 = this.f13918J;
        Y1.g gVar = (Y1.g) c0247a.f4105p;
        if (!z6) {
            this.f13918J = true;
            Y1.q qVar = gVar.f8599q;
            qVar.f8646y = false;
            qVar.f8647z = false;
            qVar.f8622E.getClass();
            qVar.c(4);
        }
        gVar.f8599q.e(true);
        this.f13917I.r(EnumC0592o.ON_START);
        Y1.q qVar2 = gVar.f8599q;
        qVar2.f8646y = false;
        qVar2.f8647z = false;
        qVar2.f8622E.getClass();
        qVar2.c(5);
    }

    public final void r() {
        super.onStop();
        this.f13920L = true;
        C0247a c0247a = this.f13916H;
        Y1.g gVar = (Y1.g) c0247a.f4105p;
        EnumC0593p enumC0593p = EnumC0593p.f9745o;
        Iterator it = gVar.f8599q.f8626c.U().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        Y1.q qVar = ((Y1.g) c0247a.f4105p).f8599q;
        qVar.f8647z = true;
        qVar.f8622E.getClass();
        qVar.c(4);
        this.f13917I.r(EnumC0592o.ON_STOP);
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public final void setContentView(int i7) {
        m();
        l().f(i7);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        super.setTheme(i7);
        ((LayoutInflaterFactory2C1111A) l()).f13810i0 = i7;
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public void setContentView(View view) {
        m();
        l().g(view);
    }

    @Override // d.AbstractActivityC0759l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().h(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        Y1.h hVar = (Y1.h) ((Y1.g) this.f13916H.f4105p).f8599q.f8628e.onCreateView(null, str, context, attributeSet);
        return hVar == null ? super.onCreateView(str, context, attributeSet) : hVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
