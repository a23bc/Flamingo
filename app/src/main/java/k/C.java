package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class C implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f13828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f13829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Method f13830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13831r;

    public C(View view, String str) {
        this.f13828o = view;
        this.f13829p = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f13830q == null) {
            View view2 = this.f13828o;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f13829p;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbU = Z1.l.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbU.append(view2.getClass());
                    sbU.append(str);
                    throw new IllegalStateException(sbU.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f13830q = method;
                        this.f13831r = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f13830q.invoke(this.f13831r, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
