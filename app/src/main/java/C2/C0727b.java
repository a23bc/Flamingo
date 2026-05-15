package c2;

import Y4.o;
import a2.AbstractC0514d;
import a2.C0513c;
import a2.C0516f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0727b extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10653o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Intent f10654p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f10655q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0727b(Intent intent, Context context, c5.d dVar) {
        super(2, dVar);
        this.f10654p = intent;
        this.f10655q = context;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0727b(this.f10654p, this.f10655q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0727b) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        o oVar = o.f8736a;
        Intent intent = this.f10654p;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10653o;
        try {
        } catch (CancellationException e7) {
            throw e7;
        } catch (Throwable unused) {
        }
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("The intent must have action parameters extras.");
        }
        Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle == null) {
            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        C0516f c0516fV = android.support.v4.media.session.b.v(new AbstractC0514d[0]);
        Iterator<T> it = bundle.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = c0516fV.f8836a;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            C0513c c0513c = new C0513c(str);
            Object obj2 = bundle.get(str);
            linkedHashMap.get(c0513c);
            if (obj2 == null) {
                linkedHashMap.remove(c0513c);
            } else {
                linkedHashMap.put(c0513c, obj2);
            }
        }
        if (extras.containsKey("android.widget.extra.CHECKED")) {
            C0513c c0513c2 = AbstractC0732g.f10663a;
            Boolean boolValueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
            linkedHashMap.get(c0513c2);
            linkedHashMap.put(c0513c2, boolValueOf);
        }
        String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
        if (string == null) {
            throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
        }
        if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
            throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
        }
        extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
        this.f10653o = 1;
        Class<?> cls = Class.forName(string);
        if (!InterfaceC0726a.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("Provided class must implement ActionCallback.");
        }
        Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        AbstractC1209k.d(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
        ((InterfaceC0726a) objNewInstance).a();
        EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
        return oVar == enumC0830a ? enumC0830a : oVar;
    }
}
