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
                "/js/bootstrap.js"
                "/js/modernizr.foundation.js")])

(defpartial top-navbar []
  [:div.navbar
    [:div.navbar-inner
      [:div.container
        [:ul#main-nav.nav
          [:li (link-to "/splash" "Reffonomics")]
          [:li (link-to "/basic" "Basic Concepts")]
          [:li (link-to "/micro" "Micro Economics")]
          [:li (link-to "/macro" "Macro Economics")]]]]])

(defpartial splash [& content]
  (html5
    (global "Welcome")
    [:body
      (top-navbar)
      [:div#wrapper content]]
      (javascript-tag
          "$(window).load(function(){
           $('#featured').orbit({
             fluid: '16x6' })});")))

(defpartial basic [& content]
  (html5
    (global "Basic Concepts")
    [:body
      (top-navbar)
      [:div#wrapper.container-fluid content]]))

(defpartial micro [& content]
  (html5
    (global "Micro Economics")
    [:body
      (top-navbar)
      [:div#wrapper.container-fluid content]]))

(defpartial macro [& content]
  (html5
    (global "Macro Economics")
    [:body
      (top-navbar)
      [:div#wrapper.container-fluid content]]))
