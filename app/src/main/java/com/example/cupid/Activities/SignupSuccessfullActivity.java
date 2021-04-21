package com.example.cupid.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cupid.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignupSuccessfullActivity extends AppCompatActivity {

    Button next,submit;
    LinearLayout letsgetstarted,thanks;

    LinearLayout Q1main,Q2main,Q3main,Q4main,Q5main,Q6main,Q7main,Q8main,Q9main,Q10main,Q11main,Q12main,Q13main,Q14main,Q15main;

    TextView you,you2,you3,you4,you5,you6,you7,you8,you9,you10,you11,you12,you13,you14,you15;
    TextView Other,Other2,Other3,Other4,Other5,Other6,Other7,Other8,Other9,Other10,Other11,Other12,Other13,Other14,Other15;

    CircleImageView yourimg,Otherimg;

    String[] Q1spinner={"One night","A few months to a year","Several years","The rest of my life"};
    String[] Q1otherspinner={"One night","A few months to a year","Several years","The rest of my life"};

    String[] Q2spinner={"Carefree","Intense"};
    String[] Q2Otherspinner={"Carefree","Intense"};

    String[] Q3spinner={"Extremely important","Somewhat imporatant","Not very important","Not important at all"};
    String[] Q3otherspinner={"Extremely important","Somewhat imporatant","Not very important","Not important at all"};

    String[] Q4spinner={"Absolutely","No way","Get arried yes, settle down no","Get married no, settle down yes"};
    String[] Q4otherspinner={"Absolutely","No way","Get arried yes, settle down no","Get married no, settle down yes"};

    String[] Q5spinner={"Yes","No"};
    String[] Q5otherspinner={"Yes","No"};

    String[] Q6spinner={"Yes, it's not a problem for me","Yes, if I thought the debt were justified","No"};
    String[] Q6otherspinner={"Yes, it's not a problem for me","Yes, if I thought the debt were justified","No"};

    String[] Q7spinner={"Liberal / Left","Centrist","Consevative / Right","Other"};
    String[] Q7otherspinner={"Liberal / Left","Centrist","Consevative / Right","Other"};

    String[] Q8spinner={"Liberal / Left","Centrist","Consevative / Right","Other"};
    String[] Q8otherspinner={"Liberal / Left","Centrist","Consevative / Right","Other"};

    String[] Q9spinner={"Liberal / Left","Centrist","Consevative / Right","Other"};
    String[] Q9otherspinner={"Liberal / Left","Centrist","Consevative / Right","Other"};

    String[] Q10spinner={"Kissing inParis","Kissing in the tent,in woods"};
    String[] Q10otherspinner={"Kissing inParis","Kissing in the tent,in woods"};

    String[] Q11spinner={"Yes","No"};
    String[] Q11otherspinner={"Yes","No"};

    String[] Q12spinner={"Yes","No"};
    String[] Q12otherspinner={"Yes","No"};

    String[] Q13spinner={"Yes","No"};
    String[] Q13otherspinner={"Yes","No"};

    String[] Q14spinner={"Always","Usually","Rarely","Never"};
    String[] Q14otherspinner={"Always","Usually","Rarely","Never"};

    String[] Q15spinner={"Yes","No"};
    String[] Q15otherspinner={"Yes","No"};

    ListView spinner1,otherspinner1;
    ListView spinner2,otherspinner2;
    ListView spinner3,otherspinner3;
    ListView spinner4,otherspinner4;
    ListView spinner5,otherspinner5;
    ListView spinner6,otherspinner6;
    ListView spinner7,otherspinner7;
    ListView spinner8,otherspinner8;
    ListView spinner9,otherspinner9;
    ListView spinner10,otherspinner10;
    ListView spinner11,otherspinner11;
    ListView spinner12,otherspinner12;
    ListView spinner13,otherspinner13;
    ListView spinner14,otherspinner14;
    ListView spinner15,otherspinner15;

    LinearLayout otheruser,
            otheruser2,
            otheruser3,
            otheruser4,
            otheruser5,
            otheruser6,
            otheruser7,
            otheruser8,
            otheruser9,
            otheruser10,
            otheruser11,
            otheruser12,
            otheruser13,
            otheruser14,
            otheruser15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_successfull);

        Q1main = findViewById(R.id.Q1main);
        Q2main = findViewById(R.id.Q2main);
        Q3main = findViewById(R.id.Q3main);
        Q4main = findViewById(R.id.Q4main);
        Q5main = findViewById(R.id.Q5main);
        Q6main = findViewById(R.id.Q6main);
        Q7main = findViewById(R.id.Q7main);
        Q8main = findViewById(R.id.Q8main);
        Q9main = findViewById(R.id.Q9main);
        Q10main = findViewById(R.id.Q10main);
        Q11main = findViewById(R.id.Q11main);
        Q12main = findViewById(R.id.Q12main);
        Q13main = findViewById(R.id.Q13main);
        Q14main = findViewById(R.id.Q14main);
        Q15main = findViewById(R.id.Q15main);

        you = findViewById(R.id.yous);
        you2 = findViewById(R.id.you2);
        you3 = findViewById(R.id.you3);
        you4 = findViewById(R.id.you4);
        you5 = findViewById(R.id.you5);
        you6 = findViewById(R.id.you6);
        you7 = findViewById(R.id.you7);
        you8 = findViewById(R.id.you8);
        you9 = findViewById(R.id.you9);
        you10 = findViewById(R.id.you10);
        you11 = findViewById(R.id.you11);
        you12 = findViewById(R.id.you12);
        you13 = findViewById(R.id.you13);
        you14 = findViewById(R.id.you14);
        you15 = findViewById(R.id.you15);

        Other = findViewById(R.id.other);
        Other2 = findViewById(R.id.other2);
        Other3 = findViewById(R.id.other3);
        Other4 = findViewById(R.id.other4);
        Other5 = findViewById(R.id.other5);
        Other6 = findViewById(R.id.other6);
        Other7 = findViewById(R.id.other7);
        Other8 = findViewById(R.id.other8);
        Other9 = findViewById(R.id.other9);
        Other10 = findViewById(R.id.other10);
        Other11 = findViewById(R.id.other11);
        Other12 = findViewById(R.id.other12);
        Other13 = findViewById(R.id.other13);
        Other14 = findViewById(R.id.other14);
        Other15 = findViewById(R.id.other15);

        yourimg = findViewById(R.id.yourimg);
        Otherimg = findViewById(R.id.otherimg);

        otheruser = findViewById(R.id.otheruser);
        otheruser2 = findViewById(R.id.otheruser2);
        otheruser3 = findViewById(R.id.otheruser3);
        otheruser4 = findViewById(R.id.otheruser4);
        otheruser5 = findViewById(R.id.otheruser5);
        otheruser6 = findViewById(R.id.otheruser6);
        otheruser7 = findViewById(R.id.otheruser7);
        otheruser8 = findViewById(R.id.otheruser8);
        otheruser9 = findViewById(R.id.otheruser9);
        otheruser10 = findViewById(R.id.otheruser10);
        otheruser11 = findViewById(R.id.otheruser11);
        otheruser12 = findViewById(R.id.otheruser12);
        otheruser13 = findViewById(R.id.otheruser13);
        otheruser14 = findViewById(R.id.otheruser14);
        otheruser15 = findViewById(R.id.otheruser15);

        spinner1 = (ListView) findViewById(R.id.spinner1);
        spinner2 = (ListView) findViewById(R.id.spinner2);
        spinner3 = (ListView) findViewById(R.id.spinner3);
        spinner4 = (ListView) findViewById(R.id.spinner4);
        spinner5 = (ListView) findViewById(R.id.spinner5);
        spinner6 = (ListView) findViewById(R.id.spinner6);
        spinner7 = (ListView) findViewById(R.id.spinner7);
        spinner8 = (ListView) findViewById(R.id.spinner8);
        spinner9 = (ListView) findViewById(R.id.spinner9);
        spinner10 = (ListView) findViewById(R.id.spinner10);
        spinner11 = (ListView) findViewById(R.id.spinner11);
        spinner12 = (ListView) findViewById(R.id.spinner12);
        spinner13 = (ListView) findViewById(R.id.spinner13);
        spinner14 = (ListView) findViewById(R.id.spinner14);
        spinner15 = (ListView) findViewById(R.id.spinner15);

        otherspinner1 = (ListView) findViewById(R.id.otherspinner1);
        otherspinner2 = (ListView) findViewById(R.id.otherspinner2);
        otherspinner3 = (ListView) findViewById(R.id.otherspinner3);
        otherspinner4 = (ListView) findViewById(R.id.otherspinner4);
        otherspinner5 = (ListView) findViewById(R.id.otherspinner5);
        otherspinner6 = (ListView) findViewById(R.id.otherspinner6);
        otherspinner7 = (ListView) findViewById(R.id.otherspinner7);
        otherspinner8 = (ListView) findViewById(R.id.otherspinner8);
        otherspinner9 = (ListView) findViewById(R.id.otherspinner9);
        otherspinner10 = (ListView) findViewById(R.id.otherspinner10);
        otherspinner11 = (ListView) findViewById(R.id.otherspinner11);
        otherspinner12 = (ListView) findViewById(R.id.otherspinner12);
        otherspinner13 = (ListView) findViewById(R.id.otherspinner13);
        otherspinner14 = (ListView) findViewById(R.id.otherspinner14);
        otherspinner15 = (ListView) findViewById(R.id.otherspinner15);

        next = findViewById(R.id.next);
        submit=findViewById(R.id.submit);
        letsgetstarted = findViewById(R.id.letsgetstarted);
        thanks=findViewById(R.id.thanks);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(SignupSuccessfullActivity.this,HomeScreen.class);
                startActivity(i);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letsgetstarted.setVisibility(View.GONE);
                q1main();

            }
        });
    }
    public void q1main()
    {

// Mine Spinner1


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q1spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);


                return view;
            }
        };
        spinner1.setAdapter(adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner1.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = spinner1.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item,Toast.LENGTH_SHORT).show();

                spinner1.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser.setVisibility(View.VISIBLE);
                    }
                },1000);

                you.setText(item);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner1

        ArrayAdapter<String> sadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q1otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);


                return view;
            }
        };
        otherspinner1.setAdapter(sadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner1.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String items = otherspinner1.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+items,Toast.LENGTH_SHORT).show();

                otherspinner1.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q1main.setVisibility(View.GONE);
                        Q2main.setVisibility(View.VISIBLE);
                        q2main();

                    }
                },1000);

                Other.setText(items);


            }
        });

    }

    public void q2main()
    {

/////////////////////////////////////////////////////////////////////////////////////////////

// Mine Spinner2

        ArrayAdapter<String> s2adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q2spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner2.setAdapter(s2adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner2.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item2 = spinner2.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item2,Toast.LENGTH_SHORT).show();

                spinner2.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser2.setVisibility(View.VISIBLE);
                    }
                },1000);

                you2.setText(item2);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s2oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q2Otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner2.setAdapter(s2oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner2.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item2s = otherspinner2.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item2s,Toast.LENGTH_SHORT).show();

                otherspinner2.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q2main.setVisibility(View.GONE);
                        Q3main.setVisibility(View.VISIBLE);
                        q3main();

                    }
                },1000);

                Other2.setText(item2s);


            }
        });

    }

    public void q3main()
    {

// Mine Spinner3

        ArrayAdapter<String> s3adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q3spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner3.setAdapter(s3adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner3.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item3 = spinner3.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item3,Toast.LENGTH_SHORT).show();

                spinner3.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser3.setVisibility(View.VISIBLE);
                    }
                },1000);

                you3.setText(item3);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s3oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q3otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner3.setAdapter(s3oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner3.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item3s = otherspinner3.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item3s,Toast.LENGTH_SHORT).show();

                otherspinner3.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q3main.setVisibility(View.GONE);
                        Q4main.setVisibility(View.VISIBLE);
                        q4main();

                    }
                },1000);

                Other3.setText(item3s);


            }
        });




        /////////////////////////////////////////////////////////////////////////////////
    }


    public void q4main()
    {

// Mine Spinner4

        ArrayAdapter<String> s4adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q4spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner4.setAdapter(s4adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner4.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item4 = spinner4.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item4,Toast.LENGTH_SHORT).show();

                spinner4.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser4.setVisibility(View.VISIBLE);
                    }
                },1000);

                you4.setText(item4);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s4oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q4otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner4.setAdapter(s4oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner4.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item4s = otherspinner4.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item4s,Toast.LENGTH_SHORT).show();

                otherspinner4.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q4main.setVisibility(View.GONE);
                        Q5main.setVisibility(View.VISIBLE);
                        q5main();

                    }
                },1000);

                Other4.setText(item4s);


            }
        });




        /////////////////////////////////////////////////////////////////////////////////
    }


    public void q5main()
    {

// Mine Spinner5

        ArrayAdapter<String> s5adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q5spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner5.setAdapter(s5adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner5.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item5 = spinner5.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item5,Toast.LENGTH_SHORT).show();

                spinner5.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser5.setVisibility(View.VISIBLE);
                    }
                },1000);

                you5.setText(item5);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s5oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q5otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner5.setAdapter(s5oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner5.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item5s = otherspinner5.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item5s,Toast.LENGTH_SHORT).show();

                otherspinner5.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q5main.setVisibility(View.GONE);
                        Q6main.setVisibility(View.VISIBLE);
                        q6main();

                    }
                },1000);

                Other5.setText(item5s);


            }
        });




        /////////////////////////////////////////////////////////////////////////////////
    }

    public void q6main()
    {

// Mine Spinner6

        ArrayAdapter<String> s6adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q6spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner6.setAdapter(s6adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner6.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item6 = spinner6.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item6,Toast.LENGTH_SHORT).show();

                spinner6.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser6.setVisibility(View.VISIBLE);
                    }
                },1000);

                you6.setText(item6);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s6oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q6otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner6.setAdapter(s6oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner6.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item6s = otherspinner6.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item6s,Toast.LENGTH_SHORT).show();

                otherspinner6.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q6main.setVisibility(View.GONE);
                        Q7main.setVisibility(View.VISIBLE);
                        q7main();

                    }
                },1000);

                Other6.setText(item6s);


            }
        });

    }

    public void q7main()
    {

// Mine Spinner6

        ArrayAdapter<String> s7adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q7spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner7.setAdapter(s7adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner7.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item7 = spinner7.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item7,Toast.LENGTH_SHORT).show();

                spinner7.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser7.setVisibility(View.VISIBLE);
                    }
                },1000);

                you7.setText(item7);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s7oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q7otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner7.setAdapter(s7oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                otherspinner7.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item7s = otherspinner7.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item7s,Toast.LENGTH_SHORT).show();

                otherspinner7.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q7main.setVisibility(View.GONE);
                        Q8main.setVisibility(View.VISIBLE);
                        q8main();
                    }
                },1000);

                Other7.setText(item7s);


            }
        });

    }

    public void q8main()
    {

// Mine Spinner6

        ArrayAdapter<String> s8adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q8spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner8.setAdapter(s8adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner8.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item8 = spinner8.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item8,Toast.LENGTH_SHORT).show();

                spinner8.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser8.setVisibility(View.VISIBLE);
                    }
                },1000);

                you8.setText(item8);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s8oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q8otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner8.setAdapter(s8oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner8.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item8s = otherspinner8.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item8s,Toast.LENGTH_SHORT).show();

                otherspinner8.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q8main.setVisibility(View.GONE);
                        Q9main.setVisibility(View.VISIBLE);
                        q9main();
                    }
                },1000);

                Other8.setText(item8s);


            }
        });

    }

    public void q9main()
    {

// Mine Spinner6

        ArrayAdapter<String> s9adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q9spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner9.setAdapter(s9adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner9.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item9 = spinner9.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item9,Toast.LENGTH_SHORT).show();

                spinner9.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser9.setVisibility(View.VISIBLE);
                    }
                },1000);

                you9.setText(item9);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s9oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q9otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner9.setAdapter(s9oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner9.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item9s = otherspinner9.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item9s,Toast.LENGTH_SHORT).show();

                otherspinner9.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q9main.setVisibility(View.GONE);
                        Q10main.setVisibility(View.VISIBLE);
                        q10main();

                    }
                },1000);

                Other9.setText(item9s);


            }
        });

    }

    public void q10main()
    {

// Mine Spinner6

        ArrayAdapter<String> s10adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q10spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner10.setAdapter(s10adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner10.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item10 = spinner10.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item10,Toast.LENGTH_SHORT).show();

                spinner10.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser10.setVisibility(View.VISIBLE);
                    }
                },1000);

                you10.setText(item10);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s10oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q10otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner10.setAdapter(s10oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner10.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item10s = otherspinner10.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item10s,Toast.LENGTH_SHORT).show();

                otherspinner10.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q10main.setVisibility(View.GONE);
                        Q11main.setVisibility(View.VISIBLE);
                        q11main();

                    }
                },1000);

                Other10.setText(item10s);


            }
        });

    }

    public void q11main()
    {

// Mine Spinner6

        ArrayAdapter<String> s11adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q11spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner11.setAdapter(s11adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner11.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item11 = spinner11.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item11,Toast.LENGTH_SHORT).show();

                spinner11.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser11.setVisibility(View.VISIBLE);
                    }
                },1000);

                you11.setText(item11);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s11oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q11otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner11.setAdapter(s11oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner11.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item11s = otherspinner11.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item11s,Toast.LENGTH_SHORT).show();

                otherspinner11.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q11main.setVisibility(View.GONE);
                        Q12main.setVisibility(View.VISIBLE);
                        q12main();

                    }
                },1000);

                Other11.setText(item11s);

            }
        });

    }

    public void q12main()
    {

// Mine Spinner6

        ArrayAdapter<String> s12adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q12spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner12.setAdapter(s12adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner12.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item12 = spinner12.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item12,Toast.LENGTH_SHORT).show();

                spinner12.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser12.setVisibility(View.VISIBLE);
                    }
                },1000);

                you12.setText(item12);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s12oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q12otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner12.setAdapter(s12oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner12.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item12s = otherspinner12.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item12s,Toast.LENGTH_SHORT).show();

                otherspinner12.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q12main.setVisibility(View.GONE);
                        Q13main.setVisibility(View.VISIBLE);
                        q13main();

                    }
                },1000);

                Other12.setText(item12s);


            }
        });

    }

    public void q13main()
    {

// Mine Spinner6

        ArrayAdapter<String> s13adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q13spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner13.setAdapter(s13adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner13.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item13 = spinner13.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item13,Toast.LENGTH_SHORT).show();

                spinner13.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser13.setVisibility(View.VISIBLE);
                    }
                },1000);

                you13.setText(item13);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s13oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q13otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner13.setAdapter(s13oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner13.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner13.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item13s = otherspinner13.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item13s,Toast.LENGTH_SHORT).show();

                otherspinner13.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q13main.setVisibility(View.GONE);
                        Q14main.setVisibility(View.VISIBLE);
                        q14main();

                    }
                },1000);

                Other13.setText(item13s);


            }
        });

    }

    public void q14main()
    {

// Mine Spinner6

        ArrayAdapter<String> s14adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q14spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner14.setAdapter(s14adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner14.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner14.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item14 = spinner14.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item14,Toast.LENGTH_SHORT).show();

                spinner14.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser14.setVisibility(View.VISIBLE);
                    }
                },1000);

                you14.setText(item14);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s14oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q14otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner14.setAdapter(s14oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner14.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner14.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item14s = otherspinner14.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item14s,Toast.LENGTH_SHORT).show();

                otherspinner14.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q14main.setVisibility(View.GONE);
                        Q15main.setVisibility(View.VISIBLE);
                        q15main();

                    }
                },1000);

                Other14.setText(item14s);


            }
        });

    }

    public void q15main()
    {

// Mine Spinner6

        ArrayAdapter<String> s15adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q15spinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        spinner15.setAdapter(s15adapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                spinner15.setVisibility(View.VISIBLE);
            }
        },1000);


        spinner15.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item15 = spinner15.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item15,Toast.LENGTH_SHORT).show();

                spinner15.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        otheruser15.setVisibility(View.VISIBLE);
                    }
                },1000);

                you15.setText(item15);


            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Other Spinner2

        ArrayAdapter<String> s15oadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Q15otherspinner) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView mytext = (TextView) view.findViewById(android.R.id.text1);

                mytext.setTextColor(Color.BLACK);

                return view;
            }
        };
        otherspinner15.setAdapter(s15oadapter);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                otherspinner15.setVisibility(View.VISIBLE);
            }
        },1000);



        otherspinner15.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item15s = otherspinner15.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"You Selected "+item15s,Toast.LENGTH_SHORT).show();

                otherspinner15.setVisibility(View.GONE);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Q15main.setVisibility(View.GONE);
                        thanks.setVisibility(View.VISIBLE);

                    }
                },1000);

                Other15.setText(item15s);


            }
        });

    }

}