import alt from '../entry/alt';
import ArticleAction from '../actions/ArticleAction';
import {fetchJson} from '../common/lib';

class ArticleStore {
  constructor() {
    this.bindListeners({
      handleInitList: ArticleAction.initList
    });

    this.state = {
      articles: []
    }
  }

  handleInitList = ()=> {
    fetch(SERVER_URI + '/article/list', {method: 'get'}).then(data => {
      console.log('article list:', data);
      if (data.ok) {
        data.json().then(result => {
          console.log('json:', result)
        });
      } else {
        throw new Error("fetch article list Error");
      }
    });
  }

}

export default alt.createStore(ArticleStore, "ArticleStore");
