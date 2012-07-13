(ns Reffonomics-Main.views.common
  (:use [noir.core]
        [hiccup.page]
        [hiccup.element]
        [hiccup.core]))

(defpartial global [title]
  [:head
    [:title (str "Reffonomics - " title)]
    (include-css "/css/foundation.css"
                 "/css/style.css")
    (include-js "/js/jquery.min.js"
                "/js/foundation.js"
                "/js/modernizer.foundation.js")])

(defpartial top-navbar []
  [:div#navbar
    [:ul#main-nav.nav-bar
      [:li (link-to "/basic" "Basic Concepts")]
      [:li (link-to "/micro" "Micro Economics")]
      [:li (link-to "/macro" "Macro Economics")]]])

(defpartial splash [& content]
  (html5
    (global "Welcome")
    [:body
    (top-navbar)
      [:div#wrapper content]]))

(defpartial basic [& content]
  (html5
    (global "Basic Concepts")
    [:body
    (top-navbar)
      [:div#wrapper content]]))

(defpartial micro [& content]
  (html5
    (global "Micro Economics")
    [:body
      (top-navbar)
      [:div#wrapper content]]))

(defpartial macro [& content]
  (html5
    (global "Macro Economics")
    [:body
      (top-navbar)
      [:div#wrapper content]]))
