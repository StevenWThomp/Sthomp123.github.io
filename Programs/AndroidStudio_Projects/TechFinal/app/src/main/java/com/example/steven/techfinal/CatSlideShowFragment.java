package com.example.steven.techfinal;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class CatSlideShowFragment extends Fragment {
    private ImageButton mCatPictureOne;
    private ImageButton mCatPictureTwo;
    private ImageButton mCatPictureThree;
    private ImageButton mCatPictureFour;
    private ImageButton mCatPictureFive;

    public CatSlideShowFragment() {
//      Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//      Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cat_slide_show, container, false);

        mCatPictureOne= rootView.findViewById(R.id.cat_picture_one);
        mCatPictureTwo = rootView.findViewById(R.id.cat_picture_two);
        mCatPictureThree = rootView.findViewById(R.id.cat_picture_three);
        mCatPictureFour = rootView.findViewById(R.id.cat_picture_four);
        mCatPictureFive = rootView.findViewById(R.id.cat_picture_five);

        mCatPictureOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 5);
                startActivity(intent);
            }
        });
        mCatPictureTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 6);
                startActivity(intent);
            }
        });
        mCatPictureThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 7);
                startActivity(intent);
            }
        });
        mCatPictureFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 8);
                startActivity(intent);
            }
        });
        mCatPictureFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 9);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
