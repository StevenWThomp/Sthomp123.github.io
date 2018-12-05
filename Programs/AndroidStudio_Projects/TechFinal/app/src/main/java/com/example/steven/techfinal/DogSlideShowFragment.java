package com.example.steven.techfinal;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class DogSlideShowFragment extends Fragment {

    private ImageButton mDogPictureOne;
    private ImageButton mDogPictureTwo;
    private ImageButton mDogPictureThree;
    private ImageButton mDogPictureFour;
    private ImageButton mDogPictureFive;

    public DogSlideShowFragment() {
//      Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//      Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dog_slide_show, container, false);

        mDogPictureOne = rootView.findViewById(R.id.dog_picture_one);
        mDogPictureTwo = rootView.findViewById(R.id.dog_picture_two);
        mDogPictureThree = rootView.findViewById(R.id.dog_picture_three);
        mDogPictureFour = rootView.findViewById(R.id.dog_picture_four);
        mDogPictureFive = rootView.findViewById(R.id.dog_picture_five);

        mDogPictureOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });
        mDogPictureTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 1);
                startActivity(intent);
            }
        });
        mDogPictureThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 2);
                startActivity(intent);
            }
        });
        mDogPictureFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 3);
                startActivity(intent);
            }
        });
        mDogPictureFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = AnimalDescActivity.newIntent(getActivity());
                intent.putExtra("id", 4);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
