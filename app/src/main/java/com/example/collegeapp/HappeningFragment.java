package com.example.collegeapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class HappeningFragment extends Fragment {


    RecyclerView rcv;
    HappeningAdapter happeningAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_happening2, null);

        rcv = rootview.findViewById(R.id.rclview);

        happeningAdapter = new HappeningAdapter(dataqueue(), getContext());
        rcv.setAdapter(happeningAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        rcv.setLayoutManager(layoutManager);



        return rootview;
    }

    public ArrayList<Model> dataqueue() {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setHeader("C programming");
        ob1.setDesc("Electric Vehicles are escorting the change with them. Many nations have plans to electrify every vehicle on the road within this decade. India’s also working, gradually, towards this motive. And here comes Tesla, Elon Musk’s ambitious EV company. We’re sure that this will give rise to competition in the EV market, pushing the domestic players to get rid of their IC engines. From motorbikes to cars and from scooters to tractor-trailers, everyone wants to see them turning electric. Fortunately, this all is happening for the sake of our environment. No fuel burnt means no emissions. And ultimately, no pollution is caused. Everything’s clear. “EVs will put an end to the climate crisis,” everyone’s thinking like this now. But there’s a catch! It’s not going to happen any soon.\n" +
                "\n" +
                "Let’s first understand how an electric vehicle works. The main thing which makes it different from a conventional automobile is its power source. The latter has an internal combustion engine that uses diesel or petrol as fuel. By a complex thermodynamic process, the engine burns this fuel and extracts power out of it. This power is then transmitted to the wheels to move the automobile. On the contrary, in an EV, a battery is used. Again, by some complicated phenomenon, the battery stores that power and supplies when needed.\n" +
                "\n" +
                "We all know that the burning of fossil fuels such as coal, petroleum, and natural gas emits greenhouse gases. These gases are responsible for pollution, loss of glacial ice, and rise in sea level. So, replacing these fuels with electric batteries seems a great idea in the first place. But the major hindrance is the source of electricity. Let me make it clear. According to an estimate, fossil fuels account for nearly 80 percent of total energy generation in India. It means that most of the electric power is the result of the combustion of coal and petroleum.\n" +
                "\n" +
                "If you’re driving an electric car, lamentably, you’re still giving rise to pollution. It doesn’t matter what is causing pollution—your car’s engine or a distant power plant. If electricity generation is not “green,” then your electric car won’t bring any significant change. Now suppose that we, somehow, fix it. Assume that India switches to renewable sources overnight (It’d take years, in real). Is the problem rectified now? Is everything fine? I have one more bad news with me.\n" +
                "\n" +
                "Let’s focus on the battery again. You know that it is the device that’d store your newly-generated “green” energy. A typical battery for an EV constitutes rare earth metals like lithium, cobalt, nickel, etc. These elements exist beneath the Earth’s surface and come out by the process of mining. And I don’t think that I’ve to state here how polluting mining processes are! It sounds negative, right? But there are several ways to revamp the situation.\n" +
                "\n" +
                "Fortunately, the recent steps taken by the government have tried to increase the overall renewable generation capacity. And if it continues at a fast pace, it’d help rectify our first problem of pollution. Honestly, I’m very optimistic about it. Effective use of batteries can also solve our second problem too. Generally, you can charge your vehicle’s battery again if it runs out of juice. But after some time, it loses its efficiency and, ultimately, dies. Then comes its crucial period. After death, it needs to extract heavy metals out and put them to reuse. Usually, it doesn’t happen, and the battery ends up in landfills. It is primarily due to the absence of appropriate technology.\n" +
                "\n" +
                "Therefore, in the end, we can conclude that electric vehicles are not 100 percent eco-friendly. Fossil fuel emissions are harmful, no matter whether generated from a conventional car’s engine or a power plant far away (to produce electricity for an EV). And recycling batteries is a complicated and expensive process, at least for now. It requires newer technologies and innovation. Thankfully, various steps are in view to make EVs fit for the environment (and humans too).");
        ob1.setImgname(R.drawable.cp);
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setHeader("C++ Programming");
        ob2.setDesc("Desktop Progamming Language");
        ob2.setImgname(R.drawable.cpp);
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setHeader("Java Programming");
        ob3.setDesc("Desktop Progamming Language");
        ob3.setImgname(R.drawable.java);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setHeader("PHP Programming");
        ob4.setDesc("Web Progamming Language");
        ob4.setImgname(R.drawable.php);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setHeader(".NET Programming");
        ob5.setDesc("Desktop/Web Progamming Language");
        ob5.setImgname(R.drawable.dotnet);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setHeader("Wordpress Framework");
        ob6.setDesc("PHP based Blogging Framework");
        ob6.setImgname(R.drawable.wordpress);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setHeader("Magento Framework");
        ob7.setDesc("PHP Based e-Comm Framework");
        ob7.setImgname(R.drawable.magento);
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setHeader("Shopify Framework");
        ob8.setDesc("PHP based e-Comm Framework");
        ob8.setImgname(R.drawable.shopify);
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setHeader("Angular Programming");
        ob9.setDesc("Web Programming");
        ob9.setImgname(R.drawable.angular);
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setHeader("Python Programming");
        ob10.setDesc("Desktop/Web based Progamming");
        ob10.setImgname(R.drawable.python);
        holder.add(ob10);

        Model ob11 = new Model();
        ob11.setHeader("Node JS Programming");
        ob11.setDesc("Web based Programming");
        ob11.setImgname(R.drawable.nodejs);
        holder.add(ob11);


        return holder;


    }
}