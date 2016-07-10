
import React from 'react';
import { Router, Route, IndexRoute, hashHistory } from 'react-router'

import App from '../component/App';
import Article from '../component/article/Article';
import Guide from '../component/guide/Guide';
import ArticleList from '../component/article/ArticleList';

export default (
  <Router history={hashHistory}>
    <Route path="/" component={App}>
      <IndexRoute component={Article}/>
      <Route path="list" component={ArticleList}/>
    </Route>
    <Route path="/guide" component={Guide} />
  </Router>
)
