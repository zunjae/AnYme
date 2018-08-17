package com.zunjae.anyme.activities.settings;

import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;
import com.zunjae.anyme.adapters.animes.AnimeLightCardViewAdapter;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import com.zunjae.zrecyclerview.a;
import com.zunjae.zrecyclerview.b;
import defpackage.alc;
import defpackage.aux;
import java.util.List;

public final class CustomizeActivity extends AbstractActivity {
    private final int c = 2;
    private final int d = 200;
    private AnimeLightCardViewAdapter e;
    private AnimeViewModel f;
    @BindView
    RecyclerView recyclerView;
    @BindView
    Button resetButton;
    @BindView
    Button saveButton;
    @BindView
    SeekBar seekBarColumns;
    @BindView
    TextView seekBarColumnsValue;
    @BindView
    SeekBar seekBarImageHeight;
    @BindView
    TextView seekBarImageHeightValues;
    @BindView
    Toolbar toolbar;

    private void a(int i, int i2) {
        this.f.h().observe(this, new -$$Lambda$CustomizeActivity$OMUORP7cmwxDY1kaxBeuQOFVghQ(this, i, i2));
    }

    private /* synthetic */ void a(int i, int i2, List list) {
        if (list != null) {
            this.e = new AnimeLightCardViewAdapter(list, this.b);
            new b(this.b, this.recyclerView, this.e).a(i).b(a.b).a();
            if (i2 != -1) {
                this.e.a(i2);
            }
        }
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_customize_activity);
        ButterKnife.a(this);
        c(this.toolbar);
        this.f = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.seekBarColumns.setOnSeekBarChangeListener(new a(this));
        this.seekBarImageHeight.setOnSeekBarChangeListener(new b(this));
        int b = aux.b("@@KEY_Custom_Column_Count", 3);
        int a = alc.a(true);
        a(b, a);
        this.seekBarColumns.setProgress(b - 2);
        this.seekBarColumnsValue.setText(String.valueOf(b));
        this.seekBarImageHeight.setProgress(a - 200);
        this.seekBarImageHeightValues.setText(String.valueOf(a));
    }

    @OnClick
    public final void onResetButtonClicked() {
        aux.b("@@KEY_Custom_Column_Count");
        aux.b("@@KEY_Custom_Image_Height");
        a(2, 200);
        this.seekBarColumnsValue.setText("2");
        this.seekBarImageHeightValues.setText("200");
        this.seekBarColumns.setProgress(0);
        this.seekBarImageHeight.setProgress(0);
        Toast.makeText(this.b, "Settings reset!", 0).show();
        setResult(5);
        finish();
    }

    @OnClick
    public final void onSaveButtonClicked() {
        int parseInt = Integer.parseInt(this.seekBarColumnsValue.getText().toString());
        int parseInt2 = Integer.parseInt(this.seekBarImageHeightValues.getText().toString());
        if (parseInt > 0) {
            aux.a("@@KEY_Custom_Column_Count", parseInt);
            if (parseInt2 > 0) {
                aux.a("@@KEY_Custom_Image_Height", parseInt2);
                Toast.makeText(this.b, "Settings saved!", 0).show();
                setResult(5);
                finish();
                return;
            }
            throw new IllegalArgumentException("Incorrect custom size");
        }
        throw new IllegalArgumentException("Incorrect custom size");
    }
}
