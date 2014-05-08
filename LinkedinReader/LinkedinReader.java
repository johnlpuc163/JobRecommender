




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>LinkedinReader/src/org/LinkedinReader.java at master · johnlpuc163/LinkedinReader</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="johnlpuc163/LinkedinReader" name="twitter:title" /><meta content="Contribute to LinkedinReader development by creating an account on GitHub." name="twitter:description" /><meta content="https://avatars0.githubusercontent.com/u/6956662?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars0.githubusercontent.com/u/6956662?s=400" property="og:image" /><meta content="johnlpuc163/LinkedinReader" property="og:title" /><meta content="https://github.com/johnlpuc163/LinkedinReader" property="og:url" /><meta content="Contribute to LinkedinReader development by creating an account on GitHub." property="og:description" />

    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="4C74822E:1FFE:8E812D5:536AE835" name="octolytics-dimension-request_id" /><meta content="6956662" name="octolytics-actor-id" /><meta content="johnlpuc163" name="octolytics-actor-login" /><meta content="3c22fcb0df9089703835e5b27f512d939a9590ec6aed1232785aab9a009e26aa" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://github.global.ssl.fastly.net/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="OZ691Z37B3SES04KJ6PW1hOMNOBzg2570JQ2y8Vl1zlE+83QLxL/NmiG7SZqTp6h3jCQRubfRg7cD1MHnI4Zkw==" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-342dc1ceccdbd5139c1adebf91586840a05f4b28.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-88cef4d3a10cb5195058fe3cc25528853df2d701.css" media="all" rel="stylesheet" type="text/css" />
    


        <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-a6f92b4988ace11684156397e69ddb85024b3d5a.js" type="text/javascript"></script>
        <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-b8017bfecf4c638ee51a83cabadf2556752a34a6.js" type="text/javascript"></script>
        
        
      <meta http-equiv="x-pjax-version" content="d306d83164c67bcf7dafe5012f0ee572">

      
  <meta name="description" content="Contribute to LinkedinReader development by creating an account on GitHub." />

  <meta content="6956662" name="octolytics-dimension-user_id" /><meta content="johnlpuc163" name="octolytics-dimension-user_login" /><meta content="18620390" name="octolytics-dimension-repository_id" /><meta content="johnlpuc163/LinkedinReader" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="18620390" name="octolytics-dimension-repository_network_root_id" /><meta content="johnlpuc163/LinkedinReader" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/johnlpuc163/LinkedinReader/commits/master.atom" rel="alternate" title="Recent Commits to LinkedinReader:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-hotkey="g n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="s, /" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="johnlpuc163"
      data-repo="johnlpuc163/LinkedinReader"
      data-branch="master"
      data-sha="642a60338c4ff2155e2c94a9839c3daf416b655a"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="johnlpuc163/LinkedinReader" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/johnlpuc163" class="name">
        <img alt="John" class=" js-avatar" data-user="6956662" height="20" src="https://avatars3.githubusercontent.com/u/6956662?s=140" width="20" /> johnlpuc163
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <form class="logout-form" action="/logout" method="post">
        <button class="sign-out-button tooltipped tooltipped-s" aria-label="Sign out">
          <span class="octicon octicon-log-out"></span>
        </button>
      </form>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="johnlpuc163/LinkedinReader">This repository</span>
    </li>
      <li>
        <a href="/johnlpuc163/LinkedinReader/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
      <li>
        <a href="/johnlpuc163/LinkedinReader/settings/collaboration"><span class="octicon octicon-person-add"></span> New collaborator</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="V9ctZ74RqSMUUyt2js8z0Fg//1c0WswGjhaC8cqwuy8z0fwc92v7TD1ft6XswOWP00/DWyGLoDsZ7zrqd6pU1A==" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="18620390" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/johnlpuc163/LinkedinReader/watchers">
        1
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-unwatch"></span>
          Unwatch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/johnlpuc163/LinkedinReader/unstar" class="js-toggler-form starred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="NALT5Eol1r019mYBYjmc8d9j4WsPnLvsc41xSCbR1oUe0L6QUhwRC9fcuvAvGjiDuA7FP61P8k4KoviNdHklDA==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Unstar this repository" title="Unstar johnlpuc163/LinkedinReader">
        <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
      </button>
        <a class="social-count js-social-count" href="/johnlpuc163/LinkedinReader/stargazers">
          0
        </a>
</form>
    <form accept-charset="UTF-8" action="/johnlpuc163/LinkedinReader/star" class="js-toggler-form unstarred" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="i3x5xP8yFrw4IyH7uOqXCrUanjrLinC5IQ2JdYa3LKGaN/ijHg7Eob94t07qdfDwFNLk5Bq0vdHqiRcqV9CIOw==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Star this repository" title="Star johnlpuc163/LinkedinReader">
        <span class="octicon octicon-star"></span><span class="text">Star</span>
      </button>
        <a class="social-count js-social-count" href="/johnlpuc163/LinkedinReader/stargazers">
          0
        </a>
</form>  </div>

  </li>


        <li>
          <a href="/johnlpuc163/LinkedinReader/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of johnlpuc163/LinkedinReader to your account" aria-label="Fork your own copy of johnlpuc163/LinkedinReader to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/johnlpuc163/LinkedinReader/network" class="social-count">1</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/johnlpuc163" class="url fn" itemprop="url" rel="author"><span itemprop="title">johnlpuc163</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/johnlpuc163/LinkedinReader" class="js-current-repository js-repo-home-link">LinkedinReader</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/johnlpuc163/LinkedinReader" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /johnlpuc163/LinkedinReader">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/johnlpuc163/LinkedinReader/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g i" data-selected-links="repo_issues /johnlpuc163/LinkedinReader/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/johnlpuc163/LinkedinReader/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g p" data-selected-links="repo_pulls /johnlpuc163/LinkedinReader/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/johnlpuc163/LinkedinReader/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-pjax="true" data-selected-links="repo_wiki /johnlpuc163/LinkedinReader/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/johnlpuc163/LinkedinReader/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /johnlpuc163/LinkedinReader/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/johnlpuc163/LinkedinReader/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /johnlpuc163/LinkedinReader/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/johnlpuc163/LinkedinReader/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /johnlpuc163/LinkedinReader/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


      <div class="sunken-menu-separator"></div>
      <ul class="sunken-menu-group">
        <li class="tooltipped tooltipped-w" aria-label="Settings">
          <a href="/johnlpuc163/LinkedinReader/settings" aria-label="Settings" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_settings /johnlpuc163/LinkedinReader/settings">
            <span class="octicon octicon-tools"></span> <span class="full-word">Settings</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
      </ul>
  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=push">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/johnlpuc163/LinkedinReader.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/johnlpuc163/LinkedinReader.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=push">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:johnlpuc163/LinkedinReader.git" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="git@github.com:johnlpuc163/LinkedinReader.git" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=push">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/johnlpuc163/LinkedinReader" readonly="readonly">
    <span class="url-box-clippy">
    <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/johnlpuc163/LinkedinReader" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="github-windows://openRepo/https://github.com/johnlpuc163/LinkedinReader" class="minibutton sidebar-button" title="Save johnlpuc163/LinkedinReader to your computer and use it in GitHub Desktop." aria-label="Save johnlpuc163/LinkedinReader to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/johnlpuc163/LinkedinReader/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download johnlpuc163/LinkedinReader as a zip file"
                   title="Download johnlpuc163/LinkedinReader as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          

<a href="/johnlpuc163/LinkedinReader/blob/5ab2510465fae8fa2dbd28ce063f910a9fdd68ab/src/org/LinkedinReader.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:700f4f129aa655f6534fbac4b6ba6f71 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/johnlpuc163/LinkedinReader/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Find or create a branch…" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Find or create a branch…">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/johnlpuc163/LinkedinReader/blob/master/src/org/LinkedinReader.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <form accept-charset="UTF-8" action="/johnlpuc163/LinkedinReader/branches" class="js-create-branch select-menu-item select-menu-new-item-form js-navigation-item js-new-item-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="+EY/fy/PefcoG0FTL/J2hLSwHJRBpFjBf3BzcW68zg+NKx993GpE3ha2iynmTFSl4xY8gGSDbVmYGWpSGhrD+w==" /></div>
            <span class="octicon octicon-git-branch-create select-menu-item-icon"></span>
            <div class="select-menu-item-text">
              <h4>Create branch: <span class="js-new-item-name"></span></h4>
              <span class="description">from ‘master’</span>
            </div>
            <input type="hidden" name="name" id="name" class="js-new-item-value">
            <input type="hidden" name="branch" id="branch" value="master" />
            <input type="hidden" name="path" id="path" value="src/org/LinkedinReader.java" />
          </form> <!-- /.select-menu-item -->

      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/johnlpuc163/LinkedinReader" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">LinkedinReader</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/johnlpuc163/LinkedinReader/tree/master/src" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/johnlpuc163/LinkedinReader/tree/master/src/org" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">org</span></a></span><span class="separator"> / </span><strong class="final-path">LinkedinReader.java</strong> <button aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="src/org/LinkedinReader.java" data-copied-hint="copied!" type="button"><span class="octicon octicon-clippy"></span></button>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="John" class="main-avatar js-avatar" data-user="6956662" height="24" src="https://avatars3.githubusercontent.com/u/6956662?s=140" width="24" />
    <span class="author"><a href="/johnlpuc163" rel="author">johnlpuc163</a></span>
    <local-time datetime="2014-04-09T22:02:30-04:00" from="now" title-format="%Y-%m-%d %H:%M:%S %z" title="2014-04-09 22:02:30 -0400">April 09, 2014</local-time>
    <div class="commit-title">
        <a href="/johnlpuc163/LinkedinReader/commit/ee6b1d6140ba5e173dfbb467c25452d4fcec316e" class="message" data-pjax="true" title="LinkedinReader version 0.1

function:
job query, save data, parse xml">LinkedinReader version 0.1</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>1</strong>  contributor</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="John" class=" js-avatar" data-user="6956662" height="24" src="https://avatars3.githubusercontent.com/u/6956662?s=140" width="24" />
            <a href="/johnlpuc163">johnlpuc163</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>126 lines (100 sloc)</span>
          <span class="meta-divider"></span>
        <span>3.557 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/johnlpuc163/LinkedinReader?branch=master&amp;filepath=src%2Forg%2FLinkedinReader.java" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton js-update-url-with-hash"
                   href="/johnlpuc163/LinkedinReader/edit/master/src/org/LinkedinReader.java"
                   data-method="post" rel="nofollow" data-hotkey="e">Edit</a>
          <a href="/johnlpuc163/LinkedinReader/raw/master/src/org/LinkedinReader.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/johnlpuc163/LinkedinReader/blame/master/src/org/LinkedinReader.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/johnlpuc163/LinkedinReader/commits/master/src/org/LinkedinReader.java" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon"
               href="/johnlpuc163/LinkedinReader/delete/master/src/org/LinkedinReader.java"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-java js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">org</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.io.*</span><span class="o">;</span></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">org.scribe.builder.ServiceBuilder</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">org.scribe.builder.api.LinkedInApi</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">org.scribe.model.OAuthRequest</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">org.scribe.model.Response</span><span class="o">;</span></div><div class='line' id='LC9'><span class="kn">import</span> <span class="nn">org.scribe.model.Token</span><span class="o">;</span></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">org.scribe.model.Verb</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">org.scribe.oauth.OAuthService</span><span class="o">;</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="kn">import</span> <span class="nn">javax.xml.parsers.DocumentBuilder</span><span class="o">;</span></div><div class='line' id='LC14'><span class="kn">import</span> <span class="nn">javax.xml.parsers.DocumentBuilderFactory</span><span class="o">;</span></div><div class='line' id='LC15'><span class="kn">import</span> <span class="nn">org.w3c.dom.Document</span><span class="o">;</span></div><div class='line' id='LC16'><span class="kn">import</span> <span class="nn">org.w3c.dom.Element</span><span class="o">;</span></div><div class='line' id='LC17'><span class="kn">import</span> <span class="nn">org.w3c.dom.Node</span><span class="o">;</span></div><div class='line' id='LC18'><span class="kn">import</span> <span class="nn">org.w3c.dom.NodeList</span><span class="o">;</span></div><div class='line' id='LC19'><br/></div><div class='line' id='LC20'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">LinkedinReader</span> <span class="o">{</span></div><div class='line' id='LC21'><br/></div><div class='line' id='LC22'>	<span class="kd">public</span> <span class="n">OAuthService</span> <span class="n">service</span><span class="o">;</span></div><div class='line' id='LC23'>	<span class="kd">public</span> <span class="n">Token</span> <span class="n">accessToken</span><span class="o">;</span></div><div class='line' id='LC24'>	<span class="kd">public</span> <span class="n">OAuthRequest</span> <span class="n">request</span><span class="o">;</span></div><div class='line' id='LC25'>	<span class="kd">public</span> <span class="n">Response</span> <span class="n">response</span><span class="o">;</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'>	<span class="c1">//do initialization work</span></div><div class='line' id='LC28'>	<span class="kd">public</span> <span class="nf">LinkedinReader</span><span class="o">(){</span></div><div class='line' id='LC29'>		<span class="c1">//initialize params  *** u can skip this</span></div><div class='line' id='LC30'>		<span class="n">service</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ServiceBuilder</span><span class="o">()</span></div><div class='line' id='LC31'>					<span class="o">.</span><span class="na">provider</span><span class="o">(</span><span class="n">LinkedInApi</span><span class="o">.</span><span class="na">class</span><span class="o">)</span></div><div class='line' id='LC32'>					<span class="o">.</span><span class="na">apiKey</span><span class="o">(</span><span class="s">&quot;77csjm87wajmgp&quot;</span><span class="o">)</span></div><div class='line' id='LC33'>					<span class="o">.</span><span class="na">apiSecret</span><span class="o">(</span><span class="s">&quot;vua37ESj6e7efVyD&quot;</span><span class="o">)</span></div><div class='line' id='LC34'>					<span class="o">.</span><span class="na">build</span><span class="o">();</span></div><div class='line' id='LC35'>		<span class="n">accessToken</span> <span class="o">=</span> <span class="k">new</span>  <span class="n">Token</span><span class="o">(</span><span class="s">&quot;69163324-40f2-4aca-9e21-d37af8c9a734&quot;</span><span class="o">,</span> <span class="s">&quot;83536e15-6de6-477e-96cb-09de1b931e95&quot;</span><span class="o">);</span></div><div class='line' id='LC36'>		<span class="n">request</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC37'>		<span class="n">response</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC38'>		<span class="c1">//initialize finish </span></div><div class='line' id='LC39'>	<span class="o">}</span></div><div class='line' id='LC40'><br/></div><div class='line' id='LC41'>	<span class="c1">//get response from Linekdin, stored in String result</span></div><div class='line' id='LC42'>	<span class="kd">public</span> <span class="n">String</span> <span class="nf">launchQuery</span><span class="o">(</span><span class="n">String</span> <span class="n">url</span><span class="o">){</span></div><div class='line' id='LC43'>		<span class="c1">//set up to launch  *** u can skip this</span></div><div class='line' id='LC44'>	    <span class="n">request</span> <span class="o">=</span> <span class="k">new</span> <span class="n">OAuthRequest</span><span class="o">(</span><span class="n">Verb</span><span class="o">.</span><span class="na">GET</span><span class="o">,</span> <span class="n">url</span><span class="o">);</span></div><div class='line' id='LC45'>	    <span class="n">service</span><span class="o">.</span><span class="na">signRequest</span><span class="o">(</span><span class="n">accessToken</span><span class="o">,</span> <span class="n">request</span><span class="o">);</span></div><div class='line' id='LC46'>	    <span class="n">response</span> <span class="o">=</span> <span class="n">request</span><span class="o">.</span><span class="na">send</span><span class="o">();</span></div><div class='line' id='LC47'><br/></div><div class='line' id='LC48'>	    <span class="c1">//String result is what we need. If u print it, it&#39;s in xml file format already</span></div><div class='line' id='LC49'>	    <span class="n">String</span> <span class="n">result</span> <span class="o">=</span> <span class="n">response</span><span class="o">.</span><span class="na">getBody</span><span class="o">();</span></div><div class='line' id='LC50'><br/></div><div class='line' id='LC51'>	    <span class="k">return</span> <span class="n">result</span><span class="o">;</span></div><div class='line' id='LC52'>	<span class="o">}</span></div><div class='line' id='LC53'><br/></div><div class='line' id='LC54'>	<span class="c1">//save string to local file</span></div><div class='line' id='LC55'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">saveToLocal</span><span class="o">(</span><span class="n">String</span> <span class="n">data</span><span class="o">,</span> <span class="n">String</span> <span class="n">fileName</span><span class="o">){</span></div><div class='line' id='LC56'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC57'>	    	<span class="n">Writer</span> <span class="n">out</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BufferedWriter</span><span class="o">(</span><span class="k">new</span> <span class="n">OutputStreamWriter</span><span class="o">(</span></div><div class='line' id='LC58'>					 <span class="k">new</span> <span class="nf">FileOutputStream</span><span class="o">(</span><span class="n">fileName</span><span class="o">),</span> <span class="s">&quot;UTF-8&quot;</span><span class="o">));</span></div><div class='line' id='LC59'>	    	<span class="n">out</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">data</span><span class="o">);</span></div><div class='line' id='LC60'>	    	<span class="n">out</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC61'>	    <span class="o">}</span></div><div class='line' id='LC62'>	    <span class="k">catch</span><span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">){</span></div><div class='line' id='LC63'>	    	<span class="c1">//do nothing</span></div><div class='line' id='LC64'>	    <span class="o">}</span></div><div class='line' id='LC65'>	<span class="o">}</span></div><div class='line' id='LC66'><br/></div><div class='line' id='LC67'><br/></div><div class='line' id='LC68'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">parseXML</span><span class="o">(</span><span class="n">String</span> <span class="n">fileName</span><span class="o">,</span> <span class="n">String</span> <span class="n">targetTitle</span><span class="o">,</span> <span class="n">String</span><span class="o">[]</span> <span class="n">columnNames</span><span class="o">){</span></div><div class='line' id='LC69'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC70'>			<span class="n">File</span> <span class="n">jobs</span> <span class="o">=</span> <span class="k">new</span> <span class="n">File</span><span class="o">(</span><span class="n">fileName</span><span class="o">);</span></div><div class='line' id='LC71'>			<span class="n">DocumentBuilderFactory</span> <span class="n">dbFactory</span> <span class="o">=</span> <span class="n">DocumentBuilderFactory</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span></div><div class='line' id='LC72'>			<span class="n">DocumentBuilder</span> <span class="n">dBuilder</span> <span class="o">=</span> <span class="n">dbFactory</span><span class="o">.</span><span class="na">newDocumentBuilder</span><span class="o">();</span></div><div class='line' id='LC73'>			<span class="n">Document</span> <span class="n">doc</span> <span class="o">=</span> <span class="n">dBuilder</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="n">jobs</span><span class="o">);</span></div><div class='line' id='LC74'>			<span class="n">doc</span><span class="o">.</span><span class="na">getDocumentElement</span><span class="o">().</span><span class="na">normalize</span><span class="o">();</span></div><div class='line' id='LC75'><br/></div><div class='line' id='LC76'>			<span class="c1">//System.out.println(&quot;root of xml file&quot; + doc.getDocumentElement().getNodeName());</span></div><div class='line' id='LC77'>			<span class="n">NodeList</span> <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;job&quot;</span><span class="o">);</span></div><div class='line' id='LC78'>			<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;jobs count: &quot;</span> <span class="o">+</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">());</span></div><div class='line' id='LC79'><br/></div><div class='line' id='LC80'>			<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC81'>				<span class="n">Node</span> <span class="n">node</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC82'>				<span class="k">if</span> <span class="o">(</span><span class="n">node</span><span class="o">.</span><span class="na">getNodeType</span><span class="o">()</span> <span class="o">==</span> <span class="n">Node</span><span class="o">.</span><span class="na">ELEMENT_NODE</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC83'>					<span class="n">Element</span> <span class="n">element</span> <span class="o">=</span> <span class="o">(</span><span class="n">Element</span><span class="o">)</span> <span class="n">node</span><span class="o">;</span></div><div class='line' id='LC84'>					<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="nl">column:</span><span class="n">columnNames</span><span class="o">){</span></div><div class='line' id='LC85'>						<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="n">column</span><span class="o">+</span><span class="s">&quot;: &quot;</span> <span class="o">+</span> <span class="n">getValue</span><span class="o">(</span><span class="n">column</span><span class="o">,</span> <span class="n">element</span><span class="o">));</span></div><div class='line' id='LC86'>					<span class="o">}</span></div><div class='line' id='LC87'>				<span class="o">}</span></div><div class='line' id='LC88'>			<span class="o">}</span></div><div class='line' id='LC89'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">ex</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC90'>			<span class="n">ex</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC91'>		<span class="o">}</span></div><div class='line' id='LC92'>	<span class="o">}</span></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'>	<span class="c1">//used for parseXML</span></div><div class='line' id='LC95'>	<span class="kd">public</span> <span class="n">String</span> <span class="nf">getValue</span><span class="o">(</span><span class="n">String</span> <span class="n">tag</span><span class="o">,</span> <span class="n">Element</span> <span class="n">element</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC96'>		<span class="n">NodeList</span> <span class="n">nodes</span> <span class="o">=</span> <span class="n">element</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="n">tag</span><span class="o">).</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getChildNodes</span><span class="o">();</span></div><div class='line' id='LC97'>		<span class="n">Node</span> <span class="n">node</span> <span class="o">=</span> <span class="o">(</span><span class="n">Node</span><span class="o">)</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">);</span></div><div class='line' id='LC98'>		<span class="k">return</span> <span class="n">node</span><span class="o">.</span><span class="na">getNodeValue</span><span class="o">();</span></div><div class='line' id='LC99'>	<span class="o">}</span></div><div class='line' id='LC100'><br/></div><div class='line' id='LC101'><br/></div><div class='line' id='LC102'><br/></div><div class='line' id='LC103'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC104'><br/></div><div class='line' id='LC105'>		<span class="n">LinkedinReader</span> <span class="n">jobReader</span> <span class="o">=</span> <span class="k">new</span> <span class="n">LinkedinReader</span><span class="o">();</span></div><div class='line' id='LC106'><br/></div><div class='line' id='LC107'>		<span class="c1">//set what to query</span></div><div class='line' id='LC108'>		<span class="n">String</span> <span class="n">url</span> <span class="o">=</span> <span class="s">&quot;http://api.linkedin.com/v1/job-search:(jobs:(id,description))?facet=industry,4&amp;facet=industry,96&amp;start=0&amp;count=5&quot;</span><span class="o">;</span></div><div class='line' id='LC109'><br/></div><div class='line' id='LC110'>		<span class="c1">//start to query</span></div><div class='line' id='LC111'>		<span class="n">String</span> <span class="n">result</span><span class="o">;</span></div><div class='line' id='LC112'>		<span class="n">result</span> <span class="o">=</span> <span class="n">jobReader</span><span class="o">.</span><span class="na">launchQuery</span><span class="o">(</span><span class="n">url</span><span class="o">);</span></div><div class='line' id='LC113'><br/></div><div class='line' id='LC114'>		<span class="c1">//save result to local xml file</span></div><div class='line' id='LC115'>		<span class="n">String</span> <span class="n">fileName</span> <span class="o">=</span> <span class="s">&quot;jobs.xml&quot;</span><span class="o">;</span></div><div class='line' id='LC116'>		<span class="n">jobReader</span><span class="o">.</span><span class="na">saveToLocal</span><span class="o">(</span><span class="n">result</span><span class="o">,</span> <span class="n">fileName</span><span class="o">);</span></div><div class='line' id='LC117'><br/></div><div class='line' id='LC118'>		<span class="c1">//parse local xml file, print out interested columns</span></div><div class='line' id='LC119'>		<span class="n">String</span> <span class="n">targetTitle</span> <span class="o">=</span> <span class="s">&quot;job&quot;</span><span class="o">;</span></div><div class='line' id='LC120'>		<span class="n">String</span><span class="o">[]</span> <span class="n">columnNames</span> <span class="o">=</span> <span class="o">{</span><span class="s">&quot;id&quot;</span><span class="o">,</span><span class="s">&quot;description&quot;</span><span class="o">};</span></div><div class='line' id='LC121'>		<span class="n">jobReader</span><span class="o">.</span><span class="na">parseXML</span><span class="o">(</span><span class="n">fileName</span><span class="o">,</span><span class="n">targetTitle</span><span class="o">,</span><span class="n">columnNames</span><span class="o">);</span></div><div class='line' id='LC122'><br/></div><div class='line' id='LC123'>	<span class="o">}</span></div><div class='line' id='LC124'><br/></div><div class='line' id='LC125'><span class="o">}</span></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.05077s from github-fe139-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

