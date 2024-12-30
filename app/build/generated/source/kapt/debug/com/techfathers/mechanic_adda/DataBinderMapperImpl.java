package com.techfathers.mechanic_adda;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.techfathers.mechanic_adda.databinding.ActivityHomeBindingImpl;
import com.techfathers.mechanic_adda.databinding.ActivityMainBindingImpl;
import com.techfathers.mechanic_adda.databinding.BottomSheetAppShareBindingImpl;
import com.techfathers.mechanic_adda.databinding.DialogAlertBindingImpl;
import com.techfathers.mechanic_adda.databinding.DialogMessageBindingImpl;
import com.techfathers.mechanic_adda.databinding.DialogProgressCircleBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentAllRequestsBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentBookRequestBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentHomeBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentIntroBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentLoginBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentPeriodicServicesBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentRequestDetailsBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentServiceDetailsBindingImpl;
import com.techfathers.mechanic_adda.databinding.FragmentSplashBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemBookedRequestBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemNearWorkshopsBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemPeriodicServiceBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemServiceDetailSlideBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemTrendingTermBindingImpl;
import com.techfathers.mechanic_adda.databinding.ItemWelcomeSlideBindingImpl;
import com.techfathers.mechanic_adda.databinding.PartialAppBarHomeBindingImpl;
import com.techfathers.mechanic_adda.databinding.PartialSideMenuBindingImpl;
import com.techfathers.mechanic_adda.databinding.ToolbarAuthBindingImpl;
import com.techfathers.mechanic_adda.databinding.ToolbarChildBindingImpl;
import com.techfathers.mechanic_adda.databinding.ToolbarHomeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_BOTTOMSHEETAPPSHARE = 3;

  private static final int LAYOUT_DIALOGALERT = 4;

  private static final int LAYOUT_DIALOGMESSAGE = 5;

  private static final int LAYOUT_DIALOGPROGRESSCIRCLE = 6;

  private static final int LAYOUT_FRAGMENTALLREQUESTS = 7;

  private static final int LAYOUT_FRAGMENTBOOKREQUEST = 8;

  private static final int LAYOUT_FRAGMENTHOME = 9;

  private static final int LAYOUT_FRAGMENTINTRO = 10;

  private static final int LAYOUT_FRAGMENTLOGIN = 11;

  private static final int LAYOUT_FRAGMENTPERIODICSERVICES = 12;

  private static final int LAYOUT_FRAGMENTREQUESTDETAILS = 13;

  private static final int LAYOUT_FRAGMENTSERVICEDETAILS = 14;

  private static final int LAYOUT_FRAGMENTSPLASH = 15;

  private static final int LAYOUT_ITEMBOOKEDREQUEST = 16;

  private static final int LAYOUT_ITEMNEARWORKSHOPS = 17;

  private static final int LAYOUT_ITEMPERIODICSERVICE = 18;

  private static final int LAYOUT_ITEMSERVICEDETAILSLIDE = 19;

  private static final int LAYOUT_ITEMTRENDINGTERM = 20;

  private static final int LAYOUT_ITEMWELCOMESLIDE = 21;

  private static final int LAYOUT_PARTIALAPPBARHOME = 22;

  private static final int LAYOUT_PARTIALSIDEMENU = 23;

  private static final int LAYOUT_TOOLBARAUTH = 24;

  private static final int LAYOUT_TOOLBARCHILD = 25;

  private static final int LAYOUT_TOOLBARHOME = 26;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(26);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.bottom_sheet_app_share, LAYOUT_BOTTOMSHEETAPPSHARE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.dialog_alert, LAYOUT_DIALOGALERT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.dialog_message, LAYOUT_DIALOGMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.dialog_progress_circle, LAYOUT_DIALOGPROGRESSCIRCLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_all_requests, LAYOUT_FRAGMENTALLREQUESTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_book_request, LAYOUT_FRAGMENTBOOKREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_intro, LAYOUT_FRAGMENTINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_periodic_services, LAYOUT_FRAGMENTPERIODICSERVICES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_request_details, LAYOUT_FRAGMENTREQUESTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_service_details, LAYOUT_FRAGMENTSERVICEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_booked_request, LAYOUT_ITEMBOOKEDREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_near_workshops, LAYOUT_ITEMNEARWORKSHOPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_periodic_service, LAYOUT_ITEMPERIODICSERVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_service_detail_slide, LAYOUT_ITEMSERVICEDETAILSLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_trending_term, LAYOUT_ITEMTRENDINGTERM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.item_welcome_slide, LAYOUT_ITEMWELCOMESLIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.partial_app_bar_home, LAYOUT_PARTIALAPPBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.partial_side_menu, LAYOUT_PARTIALSIDEMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.toolbar_auth, LAYOUT_TOOLBARAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.toolbar_child, LAYOUT_TOOLBARCHILD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.techfathers.mechanic_adda.R.layout.toolbar_home, LAYOUT_TOOLBARHOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETAPPSHARE: {
          if ("layout/bottom_sheet_app_share_0".equals(tag)) {
            return new BottomSheetAppShareBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_app_share is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGALERT: {
          if ("layout/dialog_alert_0".equals(tag)) {
            return new DialogAlertBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_alert is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGMESSAGE: {
          if ("layout/dialog_message_0".equals(tag)) {
            return new DialogMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_message is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGPROGRESSCIRCLE: {
          if ("layout/dialog_progress_circle_0".equals(tag)) {
            return new DialogProgressCircleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_progress_circle is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTALLREQUESTS: {
          if ("layout/fragment_all_requests_0".equals(tag)) {
            return new FragmentAllRequestsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_all_requests is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKREQUEST: {
          if ("layout/fragment_book_request_0".equals(tag)) {
            return new FragmentBookRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_book_request is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINTRO: {
          if ("layout/fragment_intro_0".equals(tag)) {
            return new FragmentIntroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_intro is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERIODICSERVICES: {
          if ("layout/fragment_periodic_services_0".equals(tag)) {
            return new FragmentPeriodicServicesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_periodic_services is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREQUESTDETAILS: {
          if ("layout/fragment_request_details_0".equals(tag)) {
            return new FragmentRequestDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_request_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSERVICEDETAILS: {
          if ("layout/fragment_service_details_0".equals(tag)) {
            return new FragmentServiceDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_service_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBOOKEDREQUEST: {
          if ("layout/item_booked_request_0".equals(tag)) {
            return new ItemBookedRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_booked_request is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEARWORKSHOPS: {
          if ("layout/item_near_workshops_0".equals(tag)) {
            return new ItemNearWorkshopsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_near_workshops is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPERIODICSERVICE: {
          if ("layout/item_periodic_service_0".equals(tag)) {
            return new ItemPeriodicServiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_periodic_service is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSERVICEDETAILSLIDE: {
          if ("layout/item_service_detail_slide_0".equals(tag)) {
            return new ItemServiceDetailSlideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_service_detail_slide is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTRENDINGTERM: {
          if ("layout/item_trending_term_0".equals(tag)) {
            return new ItemTrendingTermBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_trending_term is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMWELCOMESLIDE: {
          if ("layout/item_welcome_slide_0".equals(tag)) {
            return new ItemWelcomeSlideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_welcome_slide is invalid. Received: " + tag);
        }
        case  LAYOUT_PARTIALAPPBARHOME: {
          if ("layout/partial_app_bar_home_0".equals(tag)) {
            return new PartialAppBarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for partial_app_bar_home is invalid. Received: " + tag);
        }
        case  LAYOUT_PARTIALSIDEMENU: {
          if ("layout/partial_side_menu_0".equals(tag)) {
            return new PartialSideMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for partial_side_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARAUTH: {
          if ("layout/toolbar_auth_0".equals(tag)) {
            return new ToolbarAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARCHILD: {
          if ("layout/toolbar_child_0".equals(tag)) {
            return new ToolbarChildBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_child is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARHOME: {
          if ("layout/toolbar_home_0".equals(tag)) {
            return new ToolbarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for toolbar_home is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "callback");
      sKeys.put(2, "model");
      sKeys.put(3, "pos");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(26);

    static {
      sKeys.put("layout/activity_home_0", com.techfathers.mechanic_adda.R.layout.activity_home);
      sKeys.put("layout/activity_main_0", com.techfathers.mechanic_adda.R.layout.activity_main);
      sKeys.put("layout/bottom_sheet_app_share_0", com.techfathers.mechanic_adda.R.layout.bottom_sheet_app_share);
      sKeys.put("layout/dialog_alert_0", com.techfathers.mechanic_adda.R.layout.dialog_alert);
      sKeys.put("layout/dialog_message_0", com.techfathers.mechanic_adda.R.layout.dialog_message);
      sKeys.put("layout/dialog_progress_circle_0", com.techfathers.mechanic_adda.R.layout.dialog_progress_circle);
      sKeys.put("layout/fragment_all_requests_0", com.techfathers.mechanic_adda.R.layout.fragment_all_requests);
      sKeys.put("layout/fragment_book_request_0", com.techfathers.mechanic_adda.R.layout.fragment_book_request);
      sKeys.put("layout/fragment_home_0", com.techfathers.mechanic_adda.R.layout.fragment_home);
      sKeys.put("layout/fragment_intro_0", com.techfathers.mechanic_adda.R.layout.fragment_intro);
      sKeys.put("layout/fragment_login_0", com.techfathers.mechanic_adda.R.layout.fragment_login);
      sKeys.put("layout/fragment_periodic_services_0", com.techfathers.mechanic_adda.R.layout.fragment_periodic_services);
      sKeys.put("layout/fragment_request_details_0", com.techfathers.mechanic_adda.R.layout.fragment_request_details);
      sKeys.put("layout/fragment_service_details_0", com.techfathers.mechanic_adda.R.layout.fragment_service_details);
      sKeys.put("layout/fragment_splash_0", com.techfathers.mechanic_adda.R.layout.fragment_splash);
      sKeys.put("layout/item_booked_request_0", com.techfathers.mechanic_adda.R.layout.item_booked_request);
      sKeys.put("layout/item_near_workshops_0", com.techfathers.mechanic_adda.R.layout.item_near_workshops);
      sKeys.put("layout/item_periodic_service_0", com.techfathers.mechanic_adda.R.layout.item_periodic_service);
      sKeys.put("layout/item_service_detail_slide_0", com.techfathers.mechanic_adda.R.layout.item_service_detail_slide);
      sKeys.put("layout/item_trending_term_0", com.techfathers.mechanic_adda.R.layout.item_trending_term);
      sKeys.put("layout/item_welcome_slide_0", com.techfathers.mechanic_adda.R.layout.item_welcome_slide);
      sKeys.put("layout/partial_app_bar_home_0", com.techfathers.mechanic_adda.R.layout.partial_app_bar_home);
      sKeys.put("layout/partial_side_menu_0", com.techfathers.mechanic_adda.R.layout.partial_side_menu);
      sKeys.put("layout/toolbar_auth_0", com.techfathers.mechanic_adda.R.layout.toolbar_auth);
      sKeys.put("layout/toolbar_child_0", com.techfathers.mechanic_adda.R.layout.toolbar_child);
      sKeys.put("layout/toolbar_home_0", com.techfathers.mechanic_adda.R.layout.toolbar_home);
    }
  }
}
