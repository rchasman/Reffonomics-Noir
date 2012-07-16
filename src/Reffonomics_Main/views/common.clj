(ns Reffonomics-Main.views.common
  (:use [noir.core]
        [hiccup.page]
        [hiccup.element]
        [hiccup.core]))

(defpartial global [title]
  [:head
    [:title (str "Reffonomics - " title)]
    (include-css "/css/bootstrap.css"
                 "/css/style.css")
    (include-js "/js/jquery.min.js"
                "/js/bootstrap.js")])

(defpartial top-navbar []
  [:div.navbar
    [:div.navbar-inner
      [:div.container
        [:ul#main-nav.nav
          [:a.brand {:href "/home"} "Reffonomics"]
          [:li#nav-1 (link-to "/basic" "Basic Concepts")]
          [:li#nav-2 (link-to "/micro" "Micro Economics")]
          [:li#nav-3 (link-to "/macro" "Macro Economics")]
          [:li#nav-4 (link-to "/resources" "Resources")]
          [:li#nav-5 (link-to "/about" "About")]]
        [:ul.nav.pull-right
          [:form.navbar-search
            [:input {:type "text" :class "search-query" :placeholder "Search"}]]
          [:li.divider-vertical]
          [:li.divider-vertical]
          [:li "Welcome back:<br>{user}"]
          [:li.divider-vertical]
        ]]]])

(defpartial side-navbar []
  [:div.well.sidebar-nav
    [:ul.nav.nav-list
      [:li#snav-0 (link-to "/home" "Home")]
      [:li#snav-1 (link-to "/basic" "Basic")]
      [:li#snav-2 (link-to "/micro" "Micro")]
      [:li#snav-3 (link-to "/macro" "Macro")]
      [:li#snav-4 (link-to "/resources" "Resources")]
      [:li#snav-5 (link-to "/about" "About")]
  ]])

(defpartial home [& content]
  (html5
    (global "Home")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#snav-0').addClass('active');
                       });")
  ))

(defpartial basic [& content]
  (html5
    (global "Basic Concepts")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-1').addClass('active');
                        $('#snav-1').addClass('active');
                       });")
  ))

(defpartial micro [& content]
  (html5
    (global "Micro Economics")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-2').addClass('active');
                        $('#snav-2').addClass('active');});")
  ))

(defpartial macro [& content]
  (html5
    (global "Macro Economics")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-3').addClass('active');
                        $('#snav-3').addClass('active');
                       });")
  ))

(defpartial resources [& content]
  (html5
    (global "Resources")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-4').addClass('active');
                        $('#snav-4').addClass('active');
                       });")
  ))

(defpartial about [& content]
  (html5
    (global "About")
    [:body
      (top-navbar)
      [:div.container-fluid content]]
      (javascript-tag "$(window).load(function(){
                        $('#nav-5').addClass('active');
                        $('#snav-5').addClass('active');
                       });")
  ))
