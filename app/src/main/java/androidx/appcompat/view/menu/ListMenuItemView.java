package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import j.AbstractC1089a;
import p.n;
import p.y;
import q.S0;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8954A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f8955B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f8956C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LayoutInflater f8957D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8958E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f8959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f8960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RadioButton f8961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f8962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CheckBox f8963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f8964t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f8965u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f8966v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f8967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f8968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f8970z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        S0 s0K = S0.k(getContext(), attributeSet, AbstractC1089a.f13609r, R.attr.listMenuViewStyle);
        this.f8968x = s0K.g(5);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        this.f8969y = typedArray.getResourceId(1, -1);
        this.f8954A = typedArray.getBoolean(7, false);
        this.f8970z = context;
        this.f8955B = s0K.g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f8956C = typedArrayObtainStyledAttributes.hasValue(0);
        s0K.l();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f8957D == null) {
            this.f8957D = LayoutInflater.from(getContext());
        }
        return this.f8957D;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f8965u;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8966v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8966v.getLayoutParams();
        rect.top = this.f8966v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // p.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(p.n r11) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(p.n):void");
    }

    @Override // p.y
    public n getItemData() {
        return this.f8959o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f8968x);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f8962r = textView;
        int i7 = this.f8969y;
        if (i7 != -1) {
            textView.setTextAppearance(this.f8970z, i7);
        }
        this.f8964t = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f8965u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8955B);
        }
        this.f8966v = (ImageView) findViewById(R.id.group_divider);
        this.f8967w = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f8960p != null && this.f8954A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8960p.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f8961q == null && this.f8963s == null) {
            return;
        }
        if ((this.f8959o.f14864x & 4) != 0) {
            if (this.f8961q == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8961q = radioButton;
                LinearLayout linearLayout = this.f8967w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8961q;
            view = this.f8963s;
        } else {
            if (this.f8963s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8963s = checkBox;
                LinearLayout linearLayout2 = this.f8967w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8963s;
            view = this.f8961q;
        }
        if (z6) {
            compoundButton.setChecked(this.f8959o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f8963s;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f8961q;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if ((this.f8959o.f14864x & 4) != 0) {
            if (this.f8961q == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f8961q = radioButton;
                LinearLayout linearLayout = this.f8967w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f8961q;
        } else {
            if (this.f8963s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f8963s = checkBox;
                LinearLayout linearLayout2 = this.f8967w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f8963s;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f8958E = z6;
        this.f8954A = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f8966v;
        if (imageView != null) {
            imageView.setVisibility((this.f8956C || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8959o.f14854n.getClass();
        boolean z6 = this.f8958E;
        if (z6 || this.f8954A) {
            ImageView imageView = this.f8960p;
            if (imageView == null && drawable == null && !this.f8954A) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f8960p = imageView2;
                LinearLayout linearLayout = this.f8967w;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f8954A) {
                this.f8960p.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f8960p;
            if (!z6) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f8960p.getVisibility() != 0) {
                this.f8960p.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f8962r.getVisibility() != 8) {
                this.f8962r.setVisibility(8);
            }
        } else {
            this.f8962r.setText(charSequence);
            if (this.f8962r.getVisibility() != 0) {
                this.f8962r.setVisibility(0);
            }
        }
    }
}
