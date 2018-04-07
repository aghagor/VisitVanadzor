package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.goro.visitvanadzor.R;
import com.example.goro.visitvanadzor.adapters.CustomRecyclerViewAdapter;
import com.example.goro.visitvanadzor.classes.Manifacture;
import com.example.goro.visitvanadzor.fragments.subFragments.QandakFragment;
import com.example.goro.visitvanadzor.fragments.subFragments.TarazFragment;
import com.example.goro.visitvanadzor.fragments.subFragments.WoodWorkingFragment;

import java.util.ArrayList;
import java.util.List;


public class MasterClassesFragment extends Fragment {

    private ImageView paytagortsImg;
    private ImageView tarazImg;
    private ImageView qadakImg;
    private ImageView kavImg;
    private ImageView karpetImg;
    private ImageView nkarichImg;
    private ImageView khorovatsImg;
    private ImageView tonirImg;
    private ImageView hamateghImg;
    private ImageView gataImg;
    private ImageView arishtaImg;
    private ImageView avandakanImg;
    private ImageView khotabuyserImg;
    private ImageView dzknorsutyunImg;
    private ImageView meghvapahutyunImg;
    private ImageView qaylarshavImg;
    private ImageView azgayinYergImg;
    private ImageView azgayinParImg;
    private ImageView dudukImg;
    private ImageView rockImg;
    private ImageView panirImg;
    private ImageView lanchImg;

    private static Context mContext;

    private android.app.ActionBar navigationBar;

    List<Manifacture> dummyData = new ArrayList<>();
    private CustomRecyclerViewAdapter adapter;

    public static MasterClassesFragment newInstance(Context context) {
        MasterClassesFragment fragment = new MasterClassesFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master_classes, container, false);

        navigationBar = getActivity().getActionBar();

        paytagortsImg = view.findViewById(R.id.iv_paytagorts);
        tarazImg = view.findViewById(R.id.iv_tiknikagorts);
        qadakImg = view.findViewById(R.id.iv_qandakagorts);
        kavImg = view.findViewById(R.id.iv_kavagorts);
        karpetImg = view.findViewById(R.id.iv_karpet);
        nkarichImg = view.findViewById(R.id.iv_nkarich);
        khorovatsImg = view.findViewById(R.id.iv_khorovats);
        tonirImg = view.findViewById(R.id.iv_lavash);
        hamateghImg = view.findViewById(R.id.iv_tolma);
        gataImg = view.findViewById(R.id.iv_muraba);
        arishtaImg = view.findViewById(R.id.iv_gata);
        avandakanImg = view.findViewById(R.id.iv_avandakan);
        khotabuyserImg = view.findViewById(R.id.iv_khotabuyser);
        dzknorsutyunImg = view.findViewById(R.id.iv_dzknorsutyun);
        meghvapahutyunImg = view.findViewById(R.id.iv_kolorit);
        qaylarshavImg = view.findViewById(R.id.iv_qaylarshav);
        azgayinYergImg = view.findViewById(R.id.iv_azgayin_erg);
        azgayinParImg = view.findViewById(R.id.iv_azgayin_par);
        dudukImg = view.findViewById(R.id.iv_duduk_kitar);
        rockImg = view.findViewById(R.id.iv_rock);
        panirImg = view.findViewById(R.id.iv_panir);
        lanchImg = view.findViewById(R.id.iv_lanch);
//        final Fragment[] fragment = new Fragment[1];

//        paytagortsImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                navigationBar.setTitle("Փայտագործություն");
//                fragment[0] = new WoodWorkingFragment();
//                loadFragment(fragment[0]);
//            }
//        });
//        tarazImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                navigationBar.setTitle("Փայտագործություն");
//                fragment[1] = new TarazFragment();
//                loadFragment(fragment[1]);
//            }
//        });
//
//        switch (view.getId()) {
//            case R.id.iv_paytagorts:
//
//                break;
//            case R.id.iv_tiknikagorts:
//                fragment[0] = new TarazFragment();
//                loadFragment(fragment[0]);
//                break;
//            case R.id.iv_qandakagorts:
//                fragment[0] = new QandakFragment();
//                loadFragment(fragment[0]);
//                break;
//
//        }


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }

    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.root_layout, fragment)
                .addToBackStack(null).commit();
    }

    private void createDummyDataList() {
        Manifacture manifacture1 = new Manifacture(R.drawable.amenorya, "մասնակցություն փայտամշակման " +
                "աշխատանքներին, պատառիկներ փայտարվեստի պատմությունից, կին փայտագործի " +
                "աշխատանքների դիտում: Արվեստանոցին կից սրահում փայտագործական իրերի ցուցասրահ՝ " +
                "տոհմիկ թանգարան, փայտագործի կողմից գիդի ծառայության մատուցում:\n" +
                "1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ " +
                "1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:");
        Manifacture manifacture2 = new Manifacture(R.drawable.andzrevayin, "Հայաստանի տարբեր գավառների, շրջանների ու տարբեր ժամանակների տարազներով 100-ից ավելի տիկնիկների հավաքածուի ներկայացում, տիկնիկախմբերի տեսքով ներկայացնելով  հայ ավանդական ընտանիքի կյանքի տարբեր դրվագներ: Նաև ավանդական զբաղմունքների ներկայացումը՝ տիկնիկների միջոցով՝ թել մանել, բուրդ գզել, հաց թխել և այլն: Առանձին տիկնիկախմբով կներկայացվի նաև հայկական երաժշտական գործիքակազմը:\n" +
                "1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ 1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:\n");
        Manifacture manifacture3 = new Manifacture(R.drawable.arajin_dproc_7, "մասնակցություն քարի հետ աշխատանքներում, պատրաստի քանդակների ու խաչքարերի դիտում, ցուցասրահում ներկայացված քանդակագորի ձեռքի աշխատանքների դիտում՝ կտավներ, մանրանկարչություն փայտի վրա, փոքրիկ քանդակներ և այլն: Հայկական ժողովրդական երգերի կատարում  վարպետի հետ: 1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ 1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:");
        Manifacture manifacture4 = new Manifacture(R.drawable.arcakh, "գործնականում կներկայացվի կավից պատրաստի արտադրանք ստանալու ճանապարհը, զբոսաշրջիկները կմասնակցեն կավի ճզմման գործընթացին, ապա բրուտի գործիքով կփորձեն ստեղծել սեփական արտադրանքը: Հնարավորութուն կունենան նաև նկարազարդել արվեստանոցում առկա  պատրաստի արտադրանքը և այն գնել, տանել իրենց հետ որպես հուշ:\n" +
                " 1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ 1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:\n");
        Manifacture manifacture5 = new Manifacture(R.drawable.dzmerayin, "այց ու շփում կարպետագործության ու գորգագործության խմբակների երեխաների հետ, մասնագետի աջակցությամբ մասնակցություն կապետների ու գորգերի ստեղծման աշխատանքին, անդրադարձ կարպետագործության ու գորգագործության ակունքներին: Կից ցուցասրահում՝ ավարտուն աշխատանքների ցուցադրություն և վաճառք. կարպետներ, փոքր գորգեր, բատիկա, ասեղնագործ աշխատանքներ: \n" +
                "1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ 1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:\n");
        Manifacture manifacture6 = new Manifacture(R.drawable.ekegheci_7, "կոլորիտային արվեստանոցում ցուցադրված գործերի դիտում, նկարչի հետ համատեղ կտավի ստեղծում, հարցուպատասխան թեյի կամ սուրճի սեղանի շուրջ: 1-7 հոգանոց խմբերի համար՝ 10.000 դրամ: Ավելացող յուրաքանչյուր անձի համար՝ 1.500 դրամ: Տևողությունը՝ միջինը 1 ժամ:");

        dummyData.add(manifacture1);
        dummyData.add(manifacture2);
        dummyData.add(manifacture3);
        dummyData.add(manifacture4);
        dummyData.add(manifacture5);
        dummyData.add(manifacture6);
    }


}
