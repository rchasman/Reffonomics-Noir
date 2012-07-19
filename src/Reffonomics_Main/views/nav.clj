(ns Reffonomics-Main.views.nav
  (:use [noir.core]
        [hiccup.core]
        [hiccup.page]
        [hiccup.element]))

(defpartial top-navbar-collapse []
  [:div.nav-collapse
    [:ul.nav.pull-left
      [:li#nav-1 (link-to "/basic" "Basic Concepts")]
      [:li#nav-2 (link-to "/micro" "Micro Economics")]
      [:li#nav-3 (link-to "/macro" "Macro Economics")]
      [:li#nav-4 (link-to "/resources" "Resources")]
      [:li#nav-5 (link-to "/about" "About")]
      [:li#nav-6 (link-to "/tests" "Tests")]]
    [:ul.nav.pull-right
      [:form.navbar-search
        [:input {:type "text" :class "search-query" :placeholder "Search"}]]
      [:li.divider-vertical]
      [:li.divider-vertical]
      [:li "Welcome back:<br>{user}"]
      [:li.divider-vertical]]])

(defpartial top-navbar []
  (javascript-tag "$(document).ready(function(){
                     $('.collapse').collapse({toggle:false});});")
  [:div.navbar
    [:div.navbar-inner
      [:div.container
        [:a.btn.btn-navbar {:data-toggle "collapse" :data-target ".nav-collapse"}
          [:span.icon-bar]
          [:span.icon-bar]
          [:span.icon-bar]
          [:a.brand {:href "/home"} "Reffonomics"]
          (top-navbar-collapse)]]]])

(defpartial legend []
  [:div.well
    [:button.btn.btn-primary
      [:i.icon-film]
      " &nbsp Orange Buttons Indicate Non-interactive Flash Lessons &nbsp"]
    [:br][:br]
    [:button.btn.btn-info
      [:i.icon-wrench.icon-white]
      " &nbsp Purple Buttons Indicate Interactive Flash Lessons &nbsp"]
    [:br][:br]
    [:button.btn.btn-danger
      [:i.icon-book]
      " &nbsp Red Buttons Indicate Practice Test Questions &nbsp"]
    [:br][:br]
    [:button.btn.btn-inverse
      [:i.icon-pencil.icon-white]
      " &nbsp Black Buttons Indicate 40 Question Unit Tests &nbsp"]])

(defpartial side-navbar []
  [:div.well.sidebar-nav
    [:ul.nav.nav-list
      [:li#snav-0 (link-to "/home" "Home")]
      [:li#snav-1 (link-to "/basic" "Basic Concepts")]
      [:li#snav-2 (link-to "/micro" "Micro Economics")]
      [:li#snav-3 (link-to "/macro" "Macro Economics")]
      [:li#snav-4 (link-to "/resources" "Resources")]
      [:li#snav-5 (link-to "/about" "About")]
      [:li#snav-6 (link-to "/tests" "Tests")]]]
  (legend))

(defpartial side-macro-navbar []
  [:div.well.sidebar-nav
    [:ul.nav.nav-list
      [:li.nav-header "Macro Economics"]
      [:li#macroNav-0
        [:a {:href "#all" :onClick "getMacroContent('all')"} "All Content"]]
      [:li#macroNav-1.active
        [:a {:href "#all" :onClick "getMacroContent('intro')"} "Intro to Macro Economics"]]
      [:li#macroNav-2
        [:a {:href "#consumption" :onClick "getMacroContent('consumption')"} "Consumption, Investment, Not included in GDP"]]
      [:li#macroNav-3
        [:a {:href "#keynesian" :onClick "getMacroContent('keynesian')"} "Keynesian Thought"]]
      [:li#macroNav-4
        [:a {:href "#aggregate" :onClick "getMacroContent('aggregate')"} "Aggregate Supply and Aggregate Demand"]]
      [:li#macroNav-5
        [:a {:href "#money" :onClick "getMacroContent('money')"} "Money"]]
      [:li#macroNav-6
        [:a {:href "#monetary" :onClick "getMacroContent('monetary')"} "Monetary Policy"]]
      [:li#macroNav-7
        [:a {:href "#treasury" :onClick "getMacroContent('treasury')"} "T-Accounts of Banks and the FED"]]
      [:li#macroNav-8
        [:a {:href "#fiscal" :onClick "getMacroContent('fiscal')"} "Fiscal Policy"]]
      [:li#macroNav-9
        [:a {:href "#taxes" :onClick "getMacroContent('taxes')"} "Taxes"]]
      [:li#macroNav-10
        [:a {:href "#combo" :onClick "getMacroContent('combo')"} "Fiscal and Monetary Policy Combined"]]
      [:li#macroNav-11
        [:a {:href "#foreign" :onClick "getMacroContent('foreign')"} "Foreign Markets and Trade"]]
      [:li#macroNav-12
        [:a {:href "#phillips" :onClick "getMacroContent('phillips')"} "Phillips Curve"]]
      [:li#macroNav-13
        [:a {:href "#graphs" :onClick "getMacroContent('graphs')"} "Correctly Drawn Graphs"]]
      [:li#macroNav-14
        [:a {:href "#need" :onClick "getMacroContent('need')"} "All the Graphs you 'Need' to Know"]]
      [:li#macroNav-15
        [:a {:href "#less" :onClick "getMacroContent('less')"} "Less Developed Countries"]]
      [:li#macroNav-16
        [:a {:href "#rico" :onClick "getMacroContent('rico')"} "Riconomics"]]]]
  (legend))
