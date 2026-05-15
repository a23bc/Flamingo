package R;

import A2.AbstractC0002c;
import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.Objects;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f6171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f6172d;

    public e(f fVar, b bVar, b bVar2, View view) {
        this.f6169a = fVar;
        this.f6170b = bVar;
        this.f6171c = bVar2;
        this.f6172d = view;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean a(Menu menu) {
        int i7;
        P.c cVar = (P.c) this.f6170b.a();
        int i8 = 0;
        if (AbstractC1209k.a(cVar, null)) {
            return false;
        }
        menu.clear();
        ?? r22 = cVar.f5689a;
        int size = r22.size();
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (i9 < size) {
            P.b bVar = (P.b) r22.get(i9);
            if (bVar instanceof P.d) {
                i7 = i10 + 1;
                MenuItem menuItemAdd = menu.add(i11, i10, i10, ((P.d) bVar).f5690b);
                menuItemAdd.setShowAsAction(2);
                final P.d dVar = (P.d) bVar;
                final int i12 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: R.d
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i12) {
                            case 0:
                                ((P.d) dVar).f5692d.b(((e) this).f6169a);
                                break;
                            default:
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity((Context) dVar, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    try {
                                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e7) {
                                        Objects.toString(activity);
                                        e7.toString();
                                    }
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (bVar instanceof P.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = i10 + 1;
                        final Context context = this.f6172d.getContext();
                        P.h hVar = (P.h) bVar;
                        final TextClassification textClassification = hVar.f5699b;
                        int i13 = hVar.f5700c;
                        if (i13 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i10, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(textClassification.getIcon());
                            final int i14 = 1;
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: R.d
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    switch (i14) {
                                        case 0:
                                            ((P.d) context).f5692d.b(((e) textClassification).f6169a);
                                            break;
                                        default:
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            String text = textClassification2.getText();
                                            PendingIntent activity = PendingIntent.getActivity((Context) context, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                            } else {
                                                try {
                                                    activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                                } catch (PendingIntent.CanceledException e7) {
                                                    Objects.toString(activity);
                                                    e7.toString();
                                                }
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i15 = i13 == 0 ? 1 : i8;
                            final RemoteAction remoteActionD = AbstractC0002c.d(textClassification.getActions().get(i13));
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i15 != 0 ? 16908353 : i8, i10, remoteActionD.getTitle());
                            menuItemAdd3.setShowAsAction(i15 == 0 ? 0 : 2);
                            if (i15 != 0 || remoteActionD.shouldShowIcon()) {
                                menuItemAdd3.setIcon(remoteActionD.getIcon().loadDrawable(context));
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: R.w
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    PendingIntent actionIntent = remoteActionD.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                                    } catch (PendingIntent.CanceledException e7) {
                                        Objects.toString(actionIntent);
                                        e7.toString();
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (bVar instanceof P.f) {
                    i11++;
                }
                i9++;
                i8 = 0;
            }
            i10 = i7;
            i9++;
            i8 = 0;
        }
        return true;
    }
}
