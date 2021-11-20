package com.echdr.android.echdrapp.ui.tracked_entity_instances;

import static android.text.TextUtils.isEmpty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.echdr.android.echdrapp.R;
import com.echdr.android.echdrapp.data.Sdk;
import com.echdr.android.echdrapp.data.service.ActivityStarter;
import com.echdr.android.echdrapp.data.service.forms.EnrollmentFormService;
import com.echdr.android.echdrapp.data.service.forms.RuleEngineService;
import com.echdr.android.echdrapp.ui.base.ListActivity;
import com.echdr.android.echdrapp.ui.enrollment_form.EnrollmentFormActivity;
import com.echdr.android.echdrapp.ui.enrollment_form.EnrollmentFormModified;
import com.echdr.android.echdrapp.ui.events.EventsActivity;

import org.hisp.dhis.android.core.enrollment.Enrollment;
import org.hisp.dhis.android.core.maintenance.D2Error;
import org.hisp.dhis.android.core.option.Option;
import org.hisp.dhis.android.core.trackedentity.TrackedEntityAttributeValue;
import org.hisp.dhis.android.core.trackedentity.TrackedEntityAttributeValueObjectRepository;
import org.hisp.dhis.android.core.trackedentity.TrackedEntityDataValueObjectRepository;
import org.hisp.dhis.android.core.trackedentity.TrackedEntityInstance;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.processors.PublishProcessor;


public class ChildDetailsActivity extends ListActivity {

    private PublishProcessor<Boolean> engineInitialization;
    private String trackedEntityInstanceUid;
    private Disposable disposable;
    private EditText name;
    private TextView cd_no;
    private TextView cd_dob;
    private TextView cd_gender;
    private EditText address;
    private EditText birthWeight;
    private EditText birthHeight;
    private Spinner ethnicity;
    private EditText GN_Area;
    private Spinner relationship;
    private EditText nic;
    private Spinner occupation;
    private Spinner sector;
    private Spinner highestEduLevel;
    private EditText mother_name;
    private EditText mother_dob;
    private EditText numberOfChildren;
    private EditText caregiver_name;
    private EditText lPhone;
    private EditText mNumber;

    private ImageButton edit_button;
    private RuleEngineService engineService;

    private List<Option> optionList;
    
    private Button submitButton;
    private Context context;



    private ImageView overweightNotEnrolled;
    private ImageView overweightEnrolled;
    private ImageView antopoNotEnrolled;
    private ImageView antopoEnrolled;
    private ImageView supplementaryNotEnrolled;
    private ImageView supplementaryEnrolled;
    private ImageView therapeuticNotEnrolled;
    private ImageView therapeuticEnrolled;
    private ImageView otherHealthNotEnrolled;
    private ImageView otherHealthEnrolled;
    private ImageView stuntingEnrolled;
    private ImageView stuntingNotEnrolled;
    private String orgUnit;

    protected String[] ethinicityArray;
    protected String[] relationshipArray;
    protected String[] highestEduLevelArray;
    protected String[] sectorArray;
    protected String[] occupationArray;




    private enum IntentExtra {
        TRACKED_ENTITY_INSTANCE_UID
    }

    public static Intent getTrackedEntityInstancesActivityIntent(Context context, String uid) {
        Intent intent = new Intent(context, ChildDetailsActivity.class);
        intent.putExtra(IntentExtra.TRACKED_ENTITY_INSTANCE_UID.name(), uid);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_details);

        cd_no = findViewById(R.id.cd_no);
        cd_dob = findViewById(R.id.cd_dob);
        cd_gender = findViewById(R.id.cd_gender);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        birthWeight = findViewById(R.id.birthWeight);
        birthHeight = findViewById(R.id.birthHeight);
        ethnicity = findViewById(R.id.Child_detils_page_ethnicity);
        GN_Area = findViewById(R.id.Child_detils_page_GN_Area);
        relationship = findViewById(R.id.Child_detils_page_relationship);
        nic = findViewById(R.id.Child_detils_page_nic);
        occupation = findViewById(R.id.Child_detils_page_occupation);
        sector = findViewById(R.id.Child_detils_page_sector);
        highestEduLevel = findViewById(R.id.highestEduLevel);
        mother_name = findViewById(R.id.mother_name);
        mother_dob = findViewById(R.id.mother_dob);
        numberOfChildren = findViewById(R.id.numberOfChildren);
        caregiver_name = findViewById(R.id.caregiver_name);
        lPhone = findViewById(R.id.lPhone);
        mNumber = findViewById(R.id.mPhone);
        edit_button = findViewById(R.id.edit_btn);
        submitButton = findViewById(R.id.submit);

        context = this;

        overweightNotEnrolled = findViewById(R.id.NotEnOverWeight);
        overweightEnrolled = findViewById(R.id.EnOverWeight);
        antopoNotEnrolled = findViewById(R.id.NotEnAntopo);
        antopoEnrolled = findViewById(R.id.EnAntopo);
        supplementaryNotEnrolled = findViewById(R.id.NotEnSupplementary);
        supplementaryEnrolled = findViewById(R.id.EnSupplementary);
        therapeuticNotEnrolled = findViewById(R.id.NotEnTera);
        therapeuticEnrolled = findViewById(R.id.EnTera);
        otherHealthNotEnrolled = findViewById(R.id.NotEnOtherHealth);
        otherHealthEnrolled = findViewById(R.id.EnOtherHealth);
        stuntingEnrolled = findViewById(R.id.EnStunting);
        stuntingNotEnrolled = findViewById(R.id.NotEnStunting);


        trackedEntityInstanceUid = getIntent().getStringExtra(IntentExtra.TRACKED_ENTITY_INSTANCE_UID.name());

        try{
            cd_no.setText(getValueListener("h2ATdtJguMq"));
            cd_dob.setText(getValueListener("qNH202ChkV3"));
            cd_gender.setText(getValueListener("lmtzQrlHMYF"));
            name.setText(getValueListener("zh4hiarsSD5"));
            address.setText(getValueListener("D9aC5K6C6ne"));
            birthWeight.setText(getValueListener("Fs89NLB2FrA"));
            birthHeight.setText(getValueListener("LpvdWM4YuRq"));
            //setSpinner("NsoirMjYF2C", ethnicity);

            GN_Area.setText(getValueListener("upQGjAHBjzu"));
            //setSpinner("PmA6WejlEg8", relationship);

            nic.setText(getValueListener("Gzjb3fp9FSe"));
            //setSpinner("LOPHzLXYAgC", occupation);
            //setSpinner("Y0TxeTJlnjn", sector);
            //setSpinner("gigmQXuSnNy", highestEduLevel);
            mother_name.setText(getValueListener("K7Fxa2wv2Rx"));
            mother_dob.setText(getValueListener("kYfIkz2M6En"));
            numberOfChildren.setText(getValueListener("Gy4bCBxNuo4"));
            caregiver_name.setText(getValueListener("hxCXbI5J2YS"));
            lPhone.setText(getValueListener("cpcMXDhQouL"));
            mNumber.setText(getValueListener("LYRf4eIUVuN"));

            ethnicity.setSelection(
                    getSpinnerSelection("b9CoAneYYys", ethinicityArray)
            );
            relationship.setSelection(
                    getSpinnerSelection("ghN8XfnlU5V", relationshipArray)
            );
            occupation.setSelection(
                    getSpinnerSelection("Srxv0vniOnf", occupationArray)
            );
            sector.setSelection(
                    getSpinnerSelection("igjlkmMF81X", sectorArray)
            );
            highestEduLevel.setSelection(
                    getSpinnerSelection("GMNSaaq4xST", highestEduLevelArray)
            );


        }catch (Exception e){
            e.printStackTrace();

        }
        ArrayAdapter<CharSequence> ethinicityadapter = ArrayAdapter.createFromResource(context,
                R.array.ethnicity,
                android.R.layout.simple_spinner_item);
        ethinicityadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ethnicity.setAdapter(ethinicityadapter);
        ethnicity.setOnItemSelectedListener(new EnrollmentTypeSpinnerClass());

        ArrayAdapter<CharSequence> relationshipadapter = ArrayAdapter.createFromResource(context,
                R.array.relationship,
                android.R.layout.simple_spinner_item);
        relationshipadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        relationship.setAdapter(relationshipadapter);
        relationship.setOnItemSelectedListener(new EnrollmentTypeSpinnerClass());

        ArrayAdapter<CharSequence> occupationadapter = ArrayAdapter.createFromResource(context,
                R.array.occupation,
                android.R.layout.simple_spinner_item);
        occupationadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        occupation.setAdapter(occupationadapter);
        occupation.setOnItemSelectedListener(new EnrollmentTypeSpinnerClass());

        ArrayAdapter<CharSequence> sectoradapter = ArrayAdapter.createFromResource(context,
                R.array.sector,
                android.R.layout.simple_spinner_item);
        sectoradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sector.setAdapter(sectoradapter);
        sector.setOnItemSelectedListener(new EnrollmentTypeSpinnerClass());

        ArrayAdapter<CharSequence> eduLevel = ArrayAdapter.createFromResource(context,
                R.array.highestEdu,
                android.R.layout.simple_spinner_item);
        eduLevel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        highestEduLevel.setAdapter(eduLevel);
        highestEduLevel.setOnItemSelectedListener(new EnrollmentTypeSpinnerClass());

        getEnrollment();
        EnrollToPrograms();

        edit_button.setOnClickListener(view ->{
            name.setEnabled(true);
            address.setEnabled(true);
            birthHeight.setEnabled(true);
            birthWeight.setEnabled(true);
            GN_Area.setEnabled(true);
            nic.setEnabled(true);
            mother_name.setEnabled(true);
            mother_dob.setEnabled(true);
            numberOfChildren.setEnabled(true);
            caregiver_name.setEnabled(true);
            lPhone.setEnabled(true);
            mNumber.setEnabled(true);

        });

        submitButton.setOnClickListener(view -> {
            String nameChild = name.getText().toString();
            String addressChild = address.getText().toString();
            String birthHeightChild = birthHeight.getText().toString();
            String birthWeightChild = birthWeight.getText().toString();
            //String ethnicityChild = ethnicity.getSelectedItem().toString();
            String gnAreaChild = GN_Area.getText().toString();
            //String relationChild = relationship.getSelectedItem().toString();
            String nationalId = nic.getText().toString();
            //String occupationChild = occupation.getSelectedItem().toString();
            //String sectorChild = sector.getSelectedItem().toString();
            String highestEdu = highestEduLevel.getSelectedItem().toString();
            String momName = mother_name.getText().toString();
            String momDob = mother_dob.getText().toString();
            String numberOfChil = numberOfChildren.getText().toString();
            String careName = caregiver_name.getText().toString();
            String landNumber = lPhone.getText().toString();
            String mobileNumber = mNumber.getText().toString();

            saveDataElement("zh4hiarsSD5", nameChild);
            saveDataElement("D9aC5K6C6ne", addressChild);
            saveDataElement("LpvdWM4YuRq", birthHeightChild);
            saveDataElement("Fs89NLB2FrA", birthWeightChild);
            //saveDataElement("b9CoAneYYys", ethnicityChild);
            saveDataElement("upQGjAHBjzu", gnAreaChild);
            //saveDataElement("ghN8XfnlU5V", relationChild);
            saveDataElement("Gzjb3fp9FSe", nationalId);
            //saveDataElement("Srxv0vniOnf", occupationChild);
            //saveDataElement("igjlkmMF81X", sectorChild);
            saveDataElement("GMNSaaq4xST", highestEdu);
            saveDataElement("K7Fxa2wv2Rx", momName);
            saveDataElement("kYfIkz2M6En", momDob);
            saveDataElement("Gy4bCBxNuo4", numberOfChil);
            saveDataElement("hxCXbI5J2YS", careName);
            saveDataElement("cpcMXDhQouL", landNumber);
            saveDataElement("LYRf4eIUVuN", mobileNumber);

            saveDataElement("b9CoAneYYys",
                    ethinicityArray[ethnicity.getSelectedItemPosition()]);
            saveDataElement("ghN8XfnlU5V",
                    relationshipArray[relationship.getSelectedItemPosition()]);
            saveDataElement("Srxv0vniOnf",
                    occupationArray[occupation.getSelectedItemPosition()]);
            saveDataElement("Srxv0vniOnf",
                    occupationArray[occupation.getSelectedItemPosition()]);
            saveDataElement("igjlkmMF81X",
                    sectorArray[sector.getSelectedItemPosition()]);
            saveDataElement("GMNSaaq4xST",
                    highestEduLevelArray[highestEduLevel.getSelectedItemPosition()]);


            finish();


        });



    }
    private int getSpinnerSelection(String dataElement, String [] array)
    {
        int itemPosition = -1;
        String stringElement = getDataElement(dataElement);
        for(int i =0; i<array.length; i++)
        {
            if(array[i].equals(stringElement))
            {
                itemPosition = i;
            }
        }
        return itemPosition;
    }

    private String getDataElement(String dataElement) {
        TrackedEntityAttributeValueObjectRepository valueRepository =
                Sdk.d2().trackedEntityModule().trackedEntityAttributeValues()
                        .value(
                                trackedEntityInstanceUid,
                                dataElement
                                //getIntent().getStringExtra(EnrollmentFormModified.IntentExtra.TEI_UID.name()
                                //)
                        );
        String currentValue = valueRepository.blockingExists() ?
                valueRepository.blockingGet().value() : "";

        return currentValue;
    }

    private String getValueListener(String dataElement) {

        String currentValue = Sdk.d2().trackedEntityModule().trackedEntityAttributeValues()
                .byTrackedEntityInstance().eq(trackedEntityInstanceUid)
                .byTrackedEntityAttribute().eq(dataElement)
                .one().blockingGet().value();

            return currentValue;
    }
/*
    private void setSpinner(String optionSetUid, Spinner spinnerName) {
        optionList = Sdk.d2().optionModule().options().byOptionSetUid().eq(optionSetUid).blockingGet();
        List<String> optionListNames = new ArrayList<>();
        for (Option option : optionList) optionListNames.add(option.displayName());
        spinnerName.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, android.R.id.text1, optionListNames));

    }

 */

    private void saveDataElement(String dataElement, String value){
        TrackedEntityAttributeValueObjectRepository valueRepository;
        try {
            valueRepository = Sdk.d2().trackedEntityModule().trackedEntityAttributeValues()
                    .value(
                            dataElement,
                            trackedEntityInstanceUid
                    );
        }catch (Exception e)
        {
            //EnrollmentFormService.getInstance().init(
            //Sdk.d2(),
            //teiUid,
            //"hM6Yt9FQL0n",
            //getIntent().getStringExtra(EnrollmentFormModified.IntentExtra.OU_UID.name()));
            valueRepository = Sdk.d2().trackedEntityModule().trackedEntityAttributeValues()
                    .value(
                            trackedEntityInstanceUid,
                            //EnrollmentFormService.getInstance().getEnrollmentUid(),
                            dataElement
                    );
        }

        String currentValue = valueRepository.blockingExists() ?
                valueRepository.blockingGet().value() : "";

        if (currentValue == null)
            currentValue = "";

        try{
            if(!isEmpty(value))
            {
                valueRepository.blockingSet(value);
            }else
            {
                valueRepository.blockingDeleteIfExist();
            }
        } catch (D2Error d2Error) {
            d2Error.printStackTrace();
        }finally {
            if (!value.equals(currentValue)) {
                engineInitialization.onNext(true);
            }
        }
    }

/*
    private void saveDataElement(String dataElement, String value){
        TrackedEntityAttributeValueObjectRepository valueRepository = null;
        try {
            valueRepository = Sdk.d2().trackedEntityModule().trackedEntityAttributeValues()
                    .value(
                            dataElement,
                            trackedEntityInstanceUid

                    );
        }catch (Exception e)
        {
            System.out.println(e.toString());
        }
        String currentValue = valueRepository.blockingExists() ?
                valueRepository.blockingGet().value() : "";
        if (currentValue == null)
            currentValue = "";

        try{
            if(!isEmpty(value))
            {
                valueRepository.blockingSet(value);
            }else
            {
                valueRepository.blockingDeleteIfExist();
            }
        } catch (D2Error d2Error) {
            d2Error.printStackTrace();
        }
        
    }

 */

    private void getEnrollment(){

        List<Enrollment> enrollments = Sdk.d2().enrollmentModule().enrollments()
                .byTrackedEntityInstance().eq(trackedEntityInstanceUid)
                .blockingGet();

        for (Enrollment v: enrollments) {
            System.out.println(v.program());
        }

        for (Enrollment v: enrollments) {

            if (v.program().equals("hM6Yt9FQL0n")) {
                antopoEnrolled.setVisibility(View.VISIBLE);
                antopoNotEnrolled.setVisibility(View.GONE);
            }

            if(v.program().equals("iUgzznPsePB")){
                otherHealthEnrolled.setVisibility(View.VISIBLE);
                otherHealthNotEnrolled.setVisibility(View.GONE);
            }

            if(v.program().equals("JsfNVX0hdq9")){
                overweightEnrolled.setVisibility(View.VISIBLE);
                overweightNotEnrolled.setVisibility(View.GONE);
            }

            if(v.program().equals("lSSNwBMiwrK")){
                stuntingEnrolled.setVisibility(View.VISIBLE);
                stuntingNotEnrolled.setVisibility(View.GONE);
            }

            if(v.program().equals("tc6RsYbgGzm")){
                supplementaryEnrolled.setVisibility(View.VISIBLE);
                supplementaryNotEnrolled.setVisibility(View.GONE);
            }

            if(v.program().equals("CoGsKgEG4O0")){
                therapeuticEnrolled.setVisibility(View.VISIBLE);
                therapeuticNotEnrolled.setVisibility(View.GONE);
            }

        }

    }

    private void EnrollToPrograms(){

        List<TrackedEntityInstance> s = Sdk.d2().trackedEntityModule().trackedEntityInstances().byUid().eq(trackedEntityInstanceUid).blockingGet();

        for (TrackedEntityInstance v: s) {
            orgUnit = v.organisationUnit();
            System.out.println("Organization Unit: " + orgUnit);
        }


        //
        overweightNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "JsfNVX0hdq9", orgUnit), false);

            }
        });

        overweightEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "JsfNVX0hdq9", trackedEntityInstanceUid);
                startActivity(intent);
            }
        });

        antopoNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "hM6Yt9FQL0n", orgUnit), false);

            }
        });

        antopoEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "hM6Yt9FQL0n", trackedEntityInstanceUid);
                startActivity(intent);

            }
        });

        otherHealthNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "iUgzznPsePB", orgUnit), false);

            }
        });

        otherHealthEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "iUgzznPsePB", trackedEntityInstanceUid);
                startActivity(intent);

            }
        });

        stuntingNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "lSSNwBMiwrK", orgUnit), false);

            }
        });

        stuntingEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "lSSNwBMiwrK", trackedEntityInstanceUid);
                startActivity(intent);

            }
        });

        supplementaryNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "tc6RsYbgGzm", orgUnit), false);

            }
        });

        supplementaryEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "tc6RsYbgGzm", trackedEntityInstanceUid);
                startActivity(intent);

            }
        });

        therapeuticNotEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityStarter.startActivity(ChildDetailsActivity.this,
                        EnrollmentFormActivity.getFormActivityIntent(getApplicationContext(), trackedEntityInstanceUid, "CoGsKgEG4O0", orgUnit), false);

            }
        });

        therapeuticEnrolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = EventsActivity.getIntent(getApplicationContext(), "CoGsKgEG4O0", trackedEntityInstanceUid);
                startActivity(intent);

            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (disposable != null) {
            disposable.dispose();
        }
    }

    class EnrollmentTypeSpinnerClass implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
            //Toast.makeText(v.getContext(), "Your choose :" +
            //sexArray[position], Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


}