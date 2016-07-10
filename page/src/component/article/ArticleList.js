import React, {Component} from 'react';

class ArticleList extends Component {
  render() {
    return (
      <div>
        <div className="article-list-header">
          <h3 className="ui header">
            <i className="plug icon"></i>
            <div className="content">Plug-ins</div>
          </h3>
        </div>
        <div className=" ui container">
          <div className="ui large relaxed divided very animated list article-list">
            <div className="item article-list-item">
              <div className="right floated content">
                <div className="ui basic mini button"><i className="save icon"></i></div>
              </div>
              <i className="large github middle aligned icon"></i>
              <div className="content">
                <a className="header">Semantic-Org/Semantic-UI</a>
                <div className="description">Updated 10 mins ago</div>
              </div>
            </div>
            <div className="item article-list-item">
              <i className="large github middle aligned icon"></i>
              <div className="content">
                <a className="header">Semantic-Org/Semantic-UI-Docs</a>
                <div className="description">Updated 22 mins ago</div>
              </div>
            </div>
            <div className="item article-list-item">
              <i className="large github middle aligned icon"></i>
              <div className="content">
                <a className="header">Semantic-Org/Semantic-UI-Meteor</a>
                <div className="description">Updated 34 mins ago</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default ArticleList;
