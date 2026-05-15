package com.blankj.utilcode.util;

import E3.a;
import V.o;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import java.util.HashMap;
import k.AbstractActivityC1121i;
import k.C1120h;

/* JADX INFO: loaded from: classes.dex */
public class UtilsTransActivity extends AbstractActivityC1121i {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final HashMap f10708N = new HashMap();

    public UtilsTransActivity() {
        ((o) this.f10786r.f7343q).G("androidx:appcompat", new a(this));
        j(new C1120h(this));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (f10708N.get(this) == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        throw new ClassCastException();
    }

    @Override // k.AbstractActivityC1121i, d.AbstractActivityC0759l, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, d.AbstractActivityC0759l, u1.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        getIntent().getSerializableExtra("extra_delegate");
        super.onCreate(bundle);
        finish();
    }

    @Override // k.AbstractActivityC1121i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, android.app.Activity
    public final void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, d.AbstractActivityC0759l, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // d.AbstractActivityC0759l, u1.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }

    @Override // k.AbstractActivityC1121i, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (f10708N.get(this) != null) {
            throw new ClassCastException();
        }
    }
}
