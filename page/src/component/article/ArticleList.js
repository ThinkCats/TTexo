import React, {Component} from 'react';
import connectToStores from 'alt-utils/lib/connectToStores';
import ArticleAction from '../../actions/ArticleAction';
import ArticleStore from '../../stores/ArticleStore';

class ArticleList extends Component {
  static getStores() {
    return [ArticleStore];
  }

  static getPropsFromStores() {
    let articles = ArticleStore.getState();
    console.log('articles state:', articles);
    return {articles: articles.articles};
  }

  componentDidMount() {
    ArticleAction.initList();
  }

  render() {
    let articles = this.props.articles;
    let view = null;
    if (articles && articles.length > 0) {
      view = articles.map((item) => <ArticleItem key={item.id} title={item.title} tag={item.tag}/>);
    }

    return (
      <div>
        <div className="article-list-header">
          <h3 className="ui header">
            <i className="plug icon"></i>
            <div className="content">Plug-ins</div>
          </h3>
        </div>
        <div className=" ui container article-list-container">
          <div className="ui large relaxed divided very animated selection list article-list">
            {view}
          </div>
        </div>
      </div>
    )
  }
}

class ArticleItem extends Component {
  render() {
    return (
      <div id="article-list-item" className="item ">
        <div className="right floated content">
          <div className="ui vertical animated tiny blue basic button" tabIndex="0">
            <div className="hidden content">Edit</div>
            <div className="visible content">
              <i className="edit icon"></i>
            </div>
          </div>
          <div className="ui vertical animated mini red basic button" tabIndex="0">
            <div className="hidden content">Delete</div>
            <div className="visible content">
              <i className="trash icon"></i>
            </div>
          </div>
        </div>
        <i className="large github middle aligned icon"></i>
        <div className="content">
          <a className="header">{this.props.title}</a>
          <div className="tags">tags: {this.props.tag}</div>
        </div>
      </div>
    )
  }
}

export default connectToStores(ArticleList);
